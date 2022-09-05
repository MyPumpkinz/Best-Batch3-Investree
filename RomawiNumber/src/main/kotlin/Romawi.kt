fun main(){

    print("Input: ")
    //https://stackoverflow.com/questions/41283393/reading-console-input-in-kotlin
    val inputRomawi = readLine()!!

    //https://stackoverflow.com/questions/48018091/kotlin-return-can-be-lifted-out-of-when#:~:text=In%20Kotlin%2C%20several%20statements%2C%20including,then%20return%20from%20the%20function.
    fun angka(r: Char): Int {
        return when(r){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> -1
        }
    }

    fun romawiKeAngka(inputRomawi: String): Int {
        var temp = 0
        var i = 0
        while (i < inputRomawi.length) {
            val s1 = angka(inputRomawi[i])
            if (i + 1 < inputRomawi.length) {
                val s2 = angka(inputRomawi[i + 1])
                if (s1 >= s2) {
                    temp += s1
                } else {
                    temp = temp + s2 - s1
                    i++
                }
            } else {
                temp += s1
            }
            i++
        }
        return temp
    }


    println("Output: "+ romawiKeAngka(inputRomawi))
}