package ru.netology

data class Image (
    val height : Int,
    val url : String,
    val width : Int,
    val withPadding : Int = 1
)