data class Comment(
    var id: Int,
    var fromId: Int,
    var date: Int,
    var text: String,
    var donut: Donut,
    var replyToUser: Int,
    var replyToComment: Int,
    var attachment: Attachment,
    var parentsStack: Array<Int>
)


data class thread(
    var count: Int,
    var items: Array<Comment>,
    var canPost: Boolean,
    var showReplyButton: Boolean,
    var groupsCanPost: Boolean,
)