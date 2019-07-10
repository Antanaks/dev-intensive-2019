/*
 * Developed by Antanaks on 7/10/19 8:59 PM.
 * Last modified 7/10/19 8:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.User
import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
){
    abstract fun formatMessage():String
    companion object AbstractFactory{
        var lastID:Int = -1
        fun makeMessage(from: User?, chat: Chat, date: Date = Date(), type:String = "text", payload:Any?):BaseMessage{
            lastID++

            return when(type) {
                "image"-> ImageMessage("$lastID",from,chat, date = date, image = payload as String)
                 else-> TextMessage("$lastID", from, chat, date = date, text = payload as String)
            }
        }
    }
}