fun main() {
    var gari = Car("Toyota", "Mazda", "Red", 6)
    gari.carry(15)
    println("I am a ${gari.color} ${gari.make} ${gari.model}")

    println(gari.calculateParkingFees(2))

    var basi = Bus("Toyota", "Mazda", "Red", 6)
    println(basi.maxTripFare(300.toDouble() * basi.capacity))

    println(basi.calculateParkingFees(6))
}

open class Vehicle(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people: Int) {
        println("carry $people passengers")
        var people = people -capacity
        if(people<=capacity) {
            println("carry $people passengers")
        }else{
            println("over capacity by $people")
        }

    }
    fun calculateParkingFees(hours: Int):Int{
        return hours * 20
    }


}
class Car( make:String, model:String, color:String, capacity:Int) : Vehicle(make,model,color,capacity){

}
class Bus( make:String, model:String, color:String, capacity:Int): Vehicle(make,model,color,capacity){

        fun maxTripFare(fare: Double):Double{
            var b = 0
            return b +fare
        }

    }


