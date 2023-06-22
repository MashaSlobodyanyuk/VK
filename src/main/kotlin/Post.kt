fun main(){
}


data class Post(
    var id: Int = 0,
    var text: String,
    var date: Int,
    var views: Int,
    var geo: String,
    val canPin: Boolean,
    val likes: Likes
)
