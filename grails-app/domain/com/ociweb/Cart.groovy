package com.ociweb

class Cart {

    User user
    Date dateCreated

    static constraints = {
        user nullable: false
        dateCreated nullable: false
    }

    static namedQueries = {

        latestByUser {
            order 'dateCreated', 'desc'
            projections {
                max("id")
                groupProperty("user")
            }
        }
    }
}
