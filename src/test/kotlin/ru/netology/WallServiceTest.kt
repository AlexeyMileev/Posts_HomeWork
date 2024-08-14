//package ru.netology
//
//import org.junit.Test
//import org.junit.Assert.*
//import org.junit.Before
//
//class WallServiceTest {
//
//    @Before
//    fun clearBeforeTest() {
//        WallService.clear()
//    }
//
//    @Test
//    fun addPost() {
//        val post = Post(0, "text")
//        val addedPost = WallService.add(post)
//        assertNotEquals(0, addedPost.id)
//    }
//
//    @Test
//    fun updatePost() {
//        val post = Post(0, "111")
//        WallService.add(post)
//        val updatedPost = Post(1, "222")
//        val result = WallService.update(updatedPost)
//        assertTrue(result)
//    }
//
//    @Test
//    fun notUpdatePost() {
//        val post = Post(0, "111")
//        WallService.add(post)
//        val updatedPost = Post(20, "222")
//        val result = WallService.update(updatedPost)
//        assertFalse(result)
//    }
//
//
//}
package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun updateExisting() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val post1 = Post(
            151678,
            "text_1",
            Likes(155),
            1738,
            258,
            1417,
            1578374,
            67648,
            345,
            15,
            Comments(15, true, false, true, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentAudio1, attachmentVideo1),
            null,
            121,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 234, "placeholder", true, "all"),
            1221
        )

        val post2 = Post(
            1515544,
            "text_2",
            Likes(112),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            155,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )

        val post3 = Post(
            15544,
            "text_3",
            Likes(112),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            158,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )

        val update = Post(
            5544,
            "New text",
            Likes(145),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            155,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )
        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun updateNotExisting() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val post1 = Post(
            151678,
            "text_1",
            Likes(155),
            1738,
            258,
            1417,
            1578374,
            67648,
            345,
            15,
            Comments(15, true, false, true, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentAudio1, attachmentVideo1),
            null,
            121,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 234, "placeholder", true, "all"),
            1221
        )

        val post2 = Post(
            1515544,
            "text_2",
            Likes(112),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            155,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )

        val post3 = Post(
            15544,
            "text_3",
            Likes(112),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            158,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )
        val update = Post(
            5544,
            "New text",
            Likes(145),
            165,
            254,
            2417,
            1579974,
            63648,
            347,
            18,
            Comments(155, true, false, false, false),
            Copyright(3843, "iewjfieij", "text", "type"),
            Reposts(383, true),
            Views(34),
            "post",
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            155,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 294, "placeholder", true, "all"),
            1211
        )

        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun add() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val postNew = service.add(
            Post(
                5544,
                "New text",
                Likes(145),
                165,
                254,
                2417,
                1579974,
                63648,
                347,
                18,
                Comments(155, true, false, false, false),
                Copyright(3843, "iewjfieij", "text", "type"),
                Reposts(383, true),
                Views(34),
                "post",
                null,
                arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
                null,
                155,
                null,
                true,
                true,
                false,
                true,
                false,
                false,
                Donut(true, 294, "placeholder", true, "all"),
                1211
            )
        )
        assertTrue(postNew.id > 0)
    }
}