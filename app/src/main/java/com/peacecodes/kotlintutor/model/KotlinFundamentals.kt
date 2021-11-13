package com.peacecodes.kotlintutor.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class KotlinFundamentals( val Topic: String, val Detail: String = " "): Serializable
