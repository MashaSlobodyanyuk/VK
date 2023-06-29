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

        val post1 = Post(0,  1, 1, 1, 17,"Petya",null, null, true, "Sasha", null, true,true,true,true,true,true,1,  likes = Likes())
        val post2 = post1.copy(id = 1)

        WallService.add(post1)
        val getPost = WallService.add(post2)

        assertEquals(post2.id, getPost.id)

    }

    @Test
    fun updateFalse() {
        val post3 = Post(1500,  1, 1, 1, 17,"Petya",null, null, true, "Sasha", null, true,true,true,true,true,true,1,  likes = Likes())



        val result = WallService.update(post3)
        assertEquals(result, false)
    }

    @Test
    fun updateTrue() {
        val post1 = Post(800,  1, 1, 1, 17,"Petya",null, null, true, "Sasha", null, true,true,true,true,true,true,1,  likes = Likes())

        val getPost = WallService.add(post1)
        println(getPost)
        val result = WallService.update(getPost.copy(text="Vasia"))
        assertEquals(result, true)
    }
}