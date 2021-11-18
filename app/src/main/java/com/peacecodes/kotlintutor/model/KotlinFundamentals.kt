package com.peacecodes.kotlintutor.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

//data class KotlinFundamentals( val Topic: String, val Detail: String = " "): Serializable

class KotlinModel(
) {
    companion object{
        var Topic = arrayListOf<String>("Kotlin Introduction", "Kotlin Variables", "Kotlin Comments", "Kotlin Data Types", "Kotlin Operators")
        var Details = arrayListOf<String>("Kotlin Introduction", "Kotlin Get Started", "Kotlin Syntax", "Kotlin Output", "Kotlin Comments")

    }
}
