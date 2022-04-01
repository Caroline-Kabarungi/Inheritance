fun main() {
    var manycars = car("jeeep", "benz", "black", "145")
    manycars.carry(30)
    manycars.identity()
    println(manycars.calculateParking("36")


}

class car(var make: String, var model: String, var color: String, var capacity: String) {
    fun carry(people: Int) {
        var passengers = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("High amount$passengers")
        }

    }

    fun identity() {
        println = ("I am $ make $ model")

    }

    open fun calculateparking(hour: Int): Int {
        var fee = 75
        var total1 = fee * hour
        return total1

    }

}

class bus(make: String, model: String, colour: String, capacity: Int)

fun maxfare(fair: Double): Double {
    var max = 120
    var total = max * fair
    return total
}

override fun calculationparkingfees(hours: Int): Int {
    var fee = hours * capacity

}





