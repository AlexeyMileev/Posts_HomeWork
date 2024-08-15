package ru.netology

fun main(args: Array<String>) {
    val video1 = Video(
        123,
        12345,
        "title of video 1",
        "description of video 1",
        10,
        null,
        null,
        12345,
        343567,
        5,
        30,
        7,
        "player1",
        "plarform",
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
        151670,
        true,
        false,
        true,
        6,
        "type",
        25,
        "Status",
        true,
        false,
        15,
        VideoLikes(10, true),
        VideoReposts(21, 34822, 77, false)
    )

    val audio1 = Audio(
        16,
        345644,
        "artist",
        "title",
        1756,
        "url",
        1278,
        34,
        8,
        17042024,
        3,
        8
    )

    val photo1 = Photo(
        16178,
        12,
        334233,
        7675444,
        "text",
        25022023,
        arrayOf(Sizes("size1", "url", 12, 45)),
        145,
        345
    )

    val note1 = Note(
        395839,
        9493858,
        "title",
        "text",
        17012020,
        654,
        949858,
        "Url",
        "privacyView",
        "privacyComment",
        true,
        "wiki"
    )

    val gift1 = Gift(
        47,
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
        "text",
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
        "text",
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

    WallService.add(post1)
    WallService.add(post2)

    WallService.print()

    val comment1 = Comment(
        1,
        4,
        2223434,
        324234234,
        "comment text1",
        null,
        arrayOf(attachmentPhoto1),
        null,
        null
    )

    try {
        WallService.createComment(comment1)
    } catch (e: PostNotFoundException){
        println(e.message)
    }


}