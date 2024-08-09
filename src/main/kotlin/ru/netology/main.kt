package ru.netology

fun main() {
    val likes = Likes(100)
    WallService.add(Post(1, null, likes))
    WallService.add(Post(1, "Hello"))
    WallService.print()

    println(WallService.update(Post(2, "How are you?")))
    WallService.print()

    println(WallService.update(Post(200, "How are you?")))
    WallService.print()


}