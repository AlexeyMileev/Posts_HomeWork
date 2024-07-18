package ru.netology

data class Post(val id: Int, val text: String, var likes: Likes = Likes(0))

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0


    fun add(post: Post): Post {
        posts += post.copy(id = ++lastId, likes = post.likes.copy())
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likes = post.likes.copy())
                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            print(post)
            print(" ")
        }
        println()
    }
}
