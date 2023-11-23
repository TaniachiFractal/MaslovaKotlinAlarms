import kotlinx.coroutines.*
// This function runs all clocks.
suspend fun coroutineImplement(cl: Array<Clock>,tm: MutableList<Int>) = coroutineScope {
    for (i in 0..cl.size-1)
    {
        launch{
            cl[i].ClockWork(tm[i])
        }
    }
    launch{
        for (i in 0..tm.max())
        {
            delay(1000L)
            println()}
    }
    Unit
}