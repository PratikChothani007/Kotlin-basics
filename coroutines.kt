fun main(args: Array<String>) {
    println("Enter the number of cars.")
    var input = readLine()
    if(input != null){
        runBlocking{
            try {
                var numberOfCars = input.toInt()
                builtCars(numberOfCars)
            } catch (e: Exception) {
                if(e is NumberFormatException){
                    println("Please enter valid input...")
                } else if (e is TimeoutCancellationException){
                    println("Times up!!!!!")
                } else {
                    println(e.stackTraceToString())
                }
            }
        }
    }
}

suspend fun builtCars(numberOfCars: Int){
    withTimeout(60000L) {
        repeat(numberOfCars) { i ->
            launch {
                println("Building Body of Car $i ...")
                delay(5000L)
                println("Painting Car $i ...")
                delay(5000L)
                println("Install drive of Car $i ...")
                delay(10000L)
                println("Installing batteries of Car $i ...")
                delay(15000L)
                println("Install Interior of Car $i ...")
                delay(15000L)
                println("Car $i Ready to roll...")
            }
        }
    }
}
