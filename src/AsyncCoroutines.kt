import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() = coroutineScope{
    val message: Deferred<Int> = async{ doSomeWork() }
    println(message.await())
}

suspend fun doSomeWork(): Int{
    println("doing some work")
    delay(1000L)
    println("some work is done")
    return 5
}