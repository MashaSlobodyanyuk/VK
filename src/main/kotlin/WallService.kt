object WallService {
    private var posts = emptyArray<Post>()
    private var id = 0

    fun clear() {
        posts = emptyArray()
        id = 0

        // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }

    fun add(post: Post): Post {
        if(post.id == 0) {
            posts += post.copy(id++)
        }else {
            posts += post
        }
        return posts.last()

    }

    fun update(post: Post): Boolean {
        val index = getIndex(post)
        if (index == -1) {
            return false
        } else {
            posts.set(index, post)
            return true
        }
    }

    fun getIndex(post: Post): Int {
        for (i in posts.indices) {
            if (posts[i].id == post.id) {
                return i
            }
        }
        return -1
    }
}