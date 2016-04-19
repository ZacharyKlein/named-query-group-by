package com.ociweb

class Cart {

    User user
    Date dateCreated

    static constraints = {
        user nullable: false
        dateCreated nullable: false
    }

    static namedQueries = {

        latest {
            order 'dateCreated', 'desc'
        }

        latestByUser {
            latest()
            projections {
                max("id")
                groupProperty("user")
            }
        }
    }
}
