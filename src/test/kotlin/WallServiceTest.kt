import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {

        val post1 = Post(id = 0, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true,1,1,1, likes = Likes())
        val post2 = post1.copy(id = 1)

        WallService.add(post1)
        val getPost = WallService.add(post2)

        assertEquals(post2.id, getPost.id)

    }

    @Test
    fun updateFalse() {
        val post3 = Post(id = 1500, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true, 1,1,1, likes = Likes())



        val result = WallService.update(post3)
        assertEquals(result, false)
    }

    @Test
    fun updateTrue() {
        val post1 = Post(id = 800, text = "Petya", date = 17, views = 18, geo = "Moscow", canPin = true,1,1,1, likes = Likes())
        val getPost = WallService.add(post1)
        println(getPost)
        val result = WallService.update(getPost.copy(text="Vasia"))
        assertEquals(result, true)
    }
}