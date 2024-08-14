package ru.netology

data class Post(
    val id: Int,
    val text: String?,
    var likes: Likes = Likes(0),
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdById: Int = 0,
    val dateId: Int = 0,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Int = 0,
    val comments : Comments,
    val copyright : Copyright,
    val reposts : Reposts,
    val views : Views,
    val postType : String,
    val postSource : PostSource?,
    val attachments : Array<Attachment>? = emptyArray(),
    val geo : Geo?,
    val signerId : Long,
    val copyHistory : Array<Post>? = emptyArray(),
    val canPin : Boolean,
    val canDelete : Boolean,
    val canEdit : Boolean,
    val isPinned : Boolean,
    val markedAsAds : Boolean,
    val isFavorite : Boolean,
    val donut : Donut,
    val postponedId : Long

    )

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

    fun clear() {
        posts = emptyArray()
        lastId = 0
    }

    fun print() {
        for (post in posts) {
            print(post)
            print(" ")
        }
        println()
    }
}
