/*
 * Developed by Antanaks on 7/10/19 8:15 PM.
 * Last modified 7/10/19 8:15 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String? = null,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false) {
//    Реализуй паттерн Factory с методом makeUser(fullName)
//    принимающий в качесте аргумента полное имя пользователя и возвращающий экземпляр класса User
    companion object Factory{

    private var lastID:Int = -1

        fun makeUser(fullName:String?):User{
            lastID++

            val (firstName, lastName) = Utils.parseFullName(fullName)

            return User(id = "$lastID", firstName = firstName, lastName = lastName)
        }
}
}