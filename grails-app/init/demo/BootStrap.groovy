package demo

class BootStrap {

    UserService userService

    def init = { servletContext ->
        userService.createUser('foo', ['ROLE_USER', 'ROLE_ADMIN'])
    }

}
