fun main() {
    //Qn1
oddNum()

    //Qn2
    println(arrOfNames(arrayOf("joanah","Munduru","saraah","senyonga","Ate", "Omo")))

//Qn3
    robotServe(4)
    robotServe(12)
    robotServe(8)
    robotServe(17)

    //Qn4
    numB()
    
}

//Question1
fun oddNum(){
for(num in 1..100){
    if(num%2!=0){
        println(num)
    }
}
}

fun arrOfNames(name:Array<String>): Int {
        var count = 0
        name.forEach { z ->
            if (z.length>5){
                count++
            }
        }
        return count
    }

//Question3
fun robotServe(age:Int) {
if(age<=6) {
    println("get a glass of milk")
}else if(age<15 && age>6) {
println(" get a bottle  of fanta orange ")
}else{
    println("get a bottle of cocacola")
}
}

//question4
fun numB() {
for (d in 1..100) {
    if (d % 3 == 0 && d % 5 == 0) {
        println("FizzBuzz")
    }
    else if (d % 3 == 0) {
        println("Fizz")
    }
    else if (d % 5 == 0) {
        println("Buzz")
    }

    else {
        println(d)
    }
}
}
