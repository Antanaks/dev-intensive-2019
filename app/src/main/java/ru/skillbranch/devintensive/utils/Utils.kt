/*
 * Developed by Antanaks on 7/11/19 12:13 AM.
 * Last modified 7/11/19 12:13 AM.
 * Copyright (c) 2019. All rights reserved.
 */

package ru.skillbranch.devintensive.utils

import android.annotation.TargetApi
import android.os.Build
import androidx.annotation.RequiresApi

object Utils {

    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts:List<String>? = fullName?.split(" ")
        val firstName:String? = parts?.getOrNull(0)
        val lastName:String? = parts?.getOrNull(1)

        return Pair(if (firstName != null) if (firstName.isNotEmpty()) firstName else null else null,
            if (lastName != null) if (lastName.isNotEmpty()) lastName else null else null)
    }

    fun toInitials(firstName:String?, lastName:String?): String? {
        var initials:String? = null

        if(!firstName.isNullOrBlank()){
            initials = firstName[0].toString()
        }
        if(!lastName.isNullOrBlank()){
            if (initials.isNullOrBlank()) initials = lastName[0].toString()
            else initials += lastName[0].toString()
        }
        return initials?.toUpperCase()
    }

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(Build.VERSION_CODES.N)
    fun transliteration(payload:String, divider:String = " "):String{
        var translate:String =""

        val rus = arrayOf<String>("а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я")
        val eng = arrayOf<String>("a","b","v","g","d","e","e","zh","z","i","i","k","l","m","n","o","p","r","s","t","u","f","h","c","ch","sh","sh","","i","","e","yu","ya")

        var i = 0
        while (i < payload.length){
            var j:Int = 0
            while (j <= rus.size){
                if (j==33){
                    translate+=divider
                    break
                }
                if (payload[i] == rus[j] || payload[i] == eng[j]){
                    translate+=eng[j]
                    break
                }
                j++
            }
            i++
        }
        return translate
    }
}
