package demo

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    private final static String DEFAULT_PASSWORD = 'bar'

    def createUser(String username, List<String> authorities) {
        def user = new User(username: username, password: DEFAULT_PASSWORD).save()
        authorities.each { String authority ->
            def role = new Role(authority: authority).save()
            UserRole.create(user, role, true)
        }
        user
    }

}
