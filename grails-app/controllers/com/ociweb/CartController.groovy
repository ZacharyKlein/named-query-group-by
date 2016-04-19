package com.ociweb

class CartController {

    def index() {


        def user = User.findByUsername('user1')
        def cart = Cart.latestByUser.findByUser(user)

        render "Ok: ${cart}"

    }
}
