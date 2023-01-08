fun main() {
    taskOne()
}

fun taskOne(){
    //1.9.подсчитывает количество цифр в строке;
    println("С помощью count ")
    val s = "Денис 18 лет, лентяй 5 ранга".count { it.isDigit() }
    println(s)
    println("С помощью filter ")
    val s1 = "Денис 18 лет, лентяй 5 ранга".filter { it.isDigit() }
    var counter = 0
    for (c in s1) {
        counter++
    }
    println(counter)
}