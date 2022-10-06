import kotlinx.coroutines.*

suspend fun main() = coroutineScope{
    launch{
        for(i in 0..5){
            delay(400L)
            println(i)
        }
    }

    val job =  launch() { doWork() }

    println("Start")
    job.join()
    println("End")
}

suspend fun doWork() {
    for (i in 6..10) {
        delay(400L)
        println(i)
    }
}

//Корутина не привязана к конкретному потоку.
// Она может быть приостановить выполнение в одном потоке,
// а возобновить выполнение в другом.