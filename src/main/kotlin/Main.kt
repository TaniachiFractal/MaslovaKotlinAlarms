import kotlinx.coroutines.*

// "Alarms"
// There are 3 alarm clocks. Each has a different sound and ringing time.
// They tick for some time, ring and then stop working.
suspend fun main()
{
    var arrClocks = arrayOf(Clock("Домик","Так","ДЗЫНЬ!"),
                     Clock(),
                     Clock("Мобильник","Пик","♫♫Вставай, страна огромная!♫♫"),
                     Clock("Alarm","aaa","ffffffffff"))
    var arrTimes : MutableList<Int> = ArrayList()
    for(i in arrClocks)
    {
        print("Введите время работы в секундах для будильника \""+i.ClockName+"\": \n>_ ")
        arrTimes.add(readln().toInt())
    }
    coroutineImplement(arrClocks,arrTimes)
}
