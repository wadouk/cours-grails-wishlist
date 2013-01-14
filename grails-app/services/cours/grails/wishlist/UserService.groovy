package cours.grails.wishlist

import fr.wadouk.wishlist.Role
import fr.wadouk.wishlist.User
import fr.wadouk.wishlist.UserRole

class UserService {

    public User createUser(Map params) {
        def userInstance = new User(params)
        def saved = userInstance.save(flush: true)
        if (!saved) {
            def authority = Role.findByAuthority("ROLE_USER")
            UserRole.create(userInstance,authority,true)
        }
        saved
    }

    def serviceMethod() {

    }
}
