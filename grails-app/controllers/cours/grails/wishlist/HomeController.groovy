package cours.grails.wishlist

import fr.wadouk.wishlist.User
import grails.plugins.springsecurity.Secured

@Secured("IS_AUTHENTICATED_FULLY")
class HomeController {

    def springSecurityService

    def index() {
        def currentUser = springSecurityService.currentUser as User
        render(view: "../index",model: [currentUser:currentUser])
    }
}
