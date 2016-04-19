import com.ociweb.Cart
import com.ociweb.User

class BootStrap {

    def init = { servletContext ->


        if(!User.list()) {
            def user1 = new User(username: "user1").save()
            def user2 = new User(username: "user2").save()
            def user3 = new User(username: "user3").save()

            new Cart(user: user1).save()
            new Cart(user: user1).save()
            new Cart(user: user2).save()
            new Cart(user: user2).save()
            new Cart(user: user2).save()
            new Cart(user: user3).save(flush: true)

        }

    }
    def destroy = {
    }
}
