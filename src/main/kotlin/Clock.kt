import kotlinx.coroutines.*


// "Clock"
// Has a name, tick sound, ring sound, time of ringing(seconds).
// Has a function that makes it tick for an input amount of seconds, ring and stop working.
class Clock
{
    public var ClockName = "Бомба"
    public var ClockTickSound = "Тик"
    public var ClockRingSound = "БА-БАХ!!!"

    // Base constructor.
    constructor(){}

    // All fields constructor.
    constructor(name: String,tickS: String,ringS: String)
    {
        ClockName=name; ClockTickSound=tickS; ClockRingSound=ringS
    }

    // The main function of an alarm clock.
    // Clock works for an input amount of time
    public suspend fun ClockWork(time: Int)
    {
        println("Будильник " + ClockName + " тикает: " + ClockTickSound+" ")
        for (i in 0..time)
        {
            print(i.toString()+"-"+ClockTickSound+" ")
            delay(1000L)
        }
        print(ClockRingSound+" ")
    }
}