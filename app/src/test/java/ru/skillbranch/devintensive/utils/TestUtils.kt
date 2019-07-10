/*
 * Developed by Antanaks on 7/11/19 12:52 AM.
 * Last modified 7/11/19 12:22 AM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.utils

import org.junit.Test
import ru.skillbranch.devintensive.utils.Utils.parseFullName

class TestUtils {
    @Test
    fun utilTest(){
        var (first, last) = parseFullName("Alex ")
        print("$first + $last")
    }

    @Test
    fun initialsTest(){
        assert(Utils.toInitials("john" ,"doe").equals("JD"))
        assert(Utils.toInitials("John", null).equals("J"))
        assert(Utils.toInitials(null, null).equals(null))
        assert(Utils.toInitials(" ", "").equals(null))
    }

//    @Test
//    fun transliterationTest(){
//        assert(Utils.transliteration("Женя Стереотипов") == "Zhenya Stereotipov")
//        assert(Utils.transliteration("Amazing Петр","_") == "Amazing_Petr")
//    }
}