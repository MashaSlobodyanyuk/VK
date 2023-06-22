import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        var post1 = Post(id = 0, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true, likes = Likes())
        var post2 = post1.copy(id = 1)

        WallService.add(post1)
        var getPost = WallService.add(post2)

        assertEquals(post2.id, getPost.id)

    }

    @Test
    fun updateFalse() {
        var post3 = Post(id = 1500, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true, likes = Likes())
        var post4 = Post(id = 7000, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true, likes = Likes())



        var result = WallService.update(post3)
        assertEquals(result, false)
    }

    @Test
    fun updateTrue() {
        var post1 = Post(id = 800, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true, likes = Likes())
        var getPost = WallService.add(post1)
        println(getPost)
        var result = WallService.update(getPost.copy(text="Vasia"))
        assertEquals(result, true)
    }
}