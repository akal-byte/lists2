fun main() {
println(fruits(listOf("mangoes","pineapples","guavas","avocados","bananas","oranges","lemons",
"peaches","kiwis","tangerines")))
    println(height(listOf(2,3,1,2,2,2)))
    var person= mutableListOf<Person>(
        Person("Sarah",21,54.4,5.7),
        Person("Mary",23,56.78,5.4),
        Person("Belyse",25,45.6,5.3)
    )
    sorted(person)
    person1()
    var cars=(mutableListOf<Car>(
        Car("KCT-678",12000),
        Car("KDB-684",14000),
        Car("KPA-678",6000),

        ))
    println(carList(cars))
}
fun fruits(fruitList:List<String>):List<String>{
    var fruit= listOf<String>()
    fruitList.forEachIndexed { index,element ->
        if (index%2==0){
            fruit+=element
        }
    }
    return fruit
}
fun height(heights:List<Int>): Pair<Int,Double> {
    var sum = heights.sum()
    var avg = heights.average()

    return Pair(sum, avg)
}
data class Person(var name:String,var age:Int,var weight:Double,var height:Double)
 fun sorted(person:MutableList<Person>){
     var sortedPerson=person.sortedByDescending { person->person.age }
     println(sortedPerson)
 }
data class People(var name:String,var age:Int,var weight:Double,var height:Double)
fun person1(){
    var person= mutableListOf(
        People("Sarah",21,54.4,5.7),
        People("Mary",23,56.78,5.4),
        People("Belyse",25,45.6,5.3)
    )
     person.addAll( mutableListOf(
        People("Karen",23,56.7,5.2),
        People("Meghan",25,67.8,5.9)
    )
     )
    println(person)
}
data class Car(var registration:String,var mileage:Int)
fun carList(cars:List<Car>):Int{

    var total=0
    for (car in cars){
       total+=car.mileage
    }
    val avg=total/cars.size
    return avg
}



