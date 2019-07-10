/*
 * Developed by Antanaks on 7/10/19 9:00 PM.
 * Last modified 7/10/19 9:00 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.User
import java.util.*

class ImageMessage (
    id:         String,
    from:       User?,
    chat:       Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image:       String?
) : BaseMessage(id, from, chat, isIncoming, date) {
    override fun formatMessage(): String {
        TODO("not implemented")
    }

}