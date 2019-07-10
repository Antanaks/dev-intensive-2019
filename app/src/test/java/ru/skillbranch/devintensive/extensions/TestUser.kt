/*
 * Developed by Antanaks on 7/10/19 8:16 PM.
 * Last modified 7/10/19 8:16 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.extensions

import org.junit.Test

class TestUser {

    @Test
    fun createUser(){
        var user1:User = User("0","Alex", "Snow", null)
        var user2:User = User.makeUser("Konstantin Qween")
        var user3:User = User.makeUser("Alex Been")

        assert("Alex" == user1.firstName)
        assert("Snow" == user1.lastName)
        assert("Been" == user3.lastName)
        assert(user2.id == "0")
        assert(user3.id == "1")
    }
}