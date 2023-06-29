fun main(){
}


data class Post(
    var id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    var date: Int,
    var text: String,
    var replyOwnerId: Int?, //тут может быть нул
    var replyPostId: Int?,// тут может быть нул
    val friendsOnly: Boolean,
    var postType: String,
    var signerInt: Int?, // тут может принимать нул
    val canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isPinned: Boolean,
    var MarkedAsAds: Boolean,
    var isFavorite: Boolean,
    var postponedId: Int,
    val likes: Likes
){




}
