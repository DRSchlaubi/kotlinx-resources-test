import com.goncalossilva.resources.Resource
import kotlin.test.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun test() {
        assertEquals("test", Resource("test.txt").readText())
    }
}
