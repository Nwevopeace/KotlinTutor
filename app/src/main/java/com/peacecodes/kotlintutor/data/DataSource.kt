package com.peacecodes.kotlintutor.data

import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.model.KotlinFundamentals

class DataSource {
    fun loadKotlinFundamentals(): List<KotlinFundamentals>{
        return listOf(
            KotlinFundamentals(R.string.Lesson1),
            KotlinFundamentals(R.string.Lesson2),
            KotlinFundamentals(R.string.Lesson3),
            KotlinFundamentals(R.string.Lesson4),
            KotlinFundamentals(R.string.Lesson5),
            KotlinFundamentals(R.string.Lesson6),
            KotlinFundamentals(R.string.Lesson7),
            KotlinFundamentals(R.string.Lesson8),
            KotlinFundamentals(R.string.Lesson9),
            KotlinFundamentals(R.string.Lesson10),
            KotlinFundamentals(R.string.Lesson11),
            KotlinFundamentals(R.string.Lesson12),
            KotlinFundamentals(R.string.Lesson13),
            KotlinFundamentals(R.string.Lesson14),
            KotlinFundamentals(R.string.Lesson15)
        )
    }
}