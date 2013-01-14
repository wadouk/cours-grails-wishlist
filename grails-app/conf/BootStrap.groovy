import fr.wadouk.wishlist.Role
import fr.wadouk.wishlist.User
import fr.wadouk.wishlist.UserRole

class BootStrap {

    def init = { servletContext ->
        def roleAdmin = new Role(authority: "ROLE_ADMIN").save()
        def roleUser = new Role(authority: "ROLE_USER").save()

        def userAdmin = new User(username: "admin", password: "admin", enabled: true).save()
        def userBasic = new User(username: "hello", password: "hello", enabled: true).save()

        UserRole.create(userAdmin,roleAdmin,true)
        UserRole.create(userBasic,roleUser,true)
    }
    def destroy = {
    }
}
