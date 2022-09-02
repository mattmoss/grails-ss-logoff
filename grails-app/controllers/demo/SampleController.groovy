package demo

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

class SampleController {

    SpringSecurityService springSecurityService

    @Secured('permitAll')
    def index() {
        render view: 'index', model: model
    }

    @Secured('ROLE_USER')
    def user() {
        render view: 'index', model: model
    }

    @Secured('ROLE_ADMIN')
    def admin() {
        render view: 'index', model: model
    }

    protected getModel() {
        [username: springSecurityService.currentUser]
    }
}

