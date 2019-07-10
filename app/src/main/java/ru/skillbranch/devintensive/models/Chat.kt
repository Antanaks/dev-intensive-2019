/*
 * Developed by Antanaks on 7/10/19 9:43 PM.
 * Last modified 7/10/19 9:43 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.User

class Chat(
    val id:String,
    val members:MutableList<User>,
    val messages:MutableList<String>
){

}