fun main(arg : Array<String>) {

    while(true){
        println("Want Beverage? Enter 1 for Tea, 2 for Coffee!, 3 for Exit")
        val option = readLine()
        if(option?.trim().toString() == "1"){
            Tea().getBeverage()
        } else if(option?.trim().toString() == "2") {
            Coffee().getBeverage()
        } else if(option?.trim().toString() == "3") {
            println("Thank you for visiting, Bye !!!")
            exitProcess(0)
        } else {
            println("Please enter choose valid option")
        }
    }

}

interface IngredientsAndProcess {
    fun cleanPot()
    fun stop()
    fun getMixture(){
        println("Adding hot water")
        println("Adding milk")
        println("Adding sugar")
    }
}

abstract class Beverages(val type: String): IngredientsAndProcess {

    override fun cleanPot(){
        println("Cleaning $type pot!!!")
        getMixture()
    }

    override fun stop(){
        println("Done, Enjoy your $type...")
    }

    abstract fun addIngredients()
    fun getBeverage(){
        cleanPot()
        addIngredients()
        stop()
    }
}

class Tea : Beverages(type = "Tea") {
    override fun addIngredients(){
        println("Adding tea bag...")
    }
}

class Coffee : Beverages(type = "Coffee") {
    override fun addIngredients(){
        println("Adding coffee bag...")
    }
}
