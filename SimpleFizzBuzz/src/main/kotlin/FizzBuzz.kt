fun fizz(x: Int) = x % 3 == 0
fun buzz(x: Int) = x % 5 == 0
fun fizzbuzz(x: Int) = x % 5 == 0 && x % 3 == 0

fun main() {
    print("Masukkan input: ")
    val input = readln().toInt()
    for (num in 1..input){
        when{
            fizzbuzz(num) -> println("FizzBuzz")
            fizz(num) -> println("Fizz")
            buzz(num) -> println("Buzz")
            else -> println(num)
        }
    }
}
