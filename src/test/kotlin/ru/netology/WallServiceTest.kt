package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {


    @Test
    fun addPost() {
        val post = Post(0, "text")
        val addedPost = WallService.add(post)
        assertNotEquals(0, addedPost.id)
    }

    @Test
    fun updatePost() {
        val post = Post(0, "111")
        WallService.add(post)
        val updatedPost = Post(1, "222")
        val result = WallService.update(updatedPost)
        assertTrue(result)
    }

    @Test
    fun notUpdatePost() {
        val post = Post(0, "111")
        WallService.add(post)
        val updatedPost = Post(20, "222")
        val result = WallService.update(updatedPost)
        assertFalse(result)
    }


}