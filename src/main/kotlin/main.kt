fun main() {
    val likes = 11
    val result = if (((likes % 10) == 1) || likes == 1) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(result)
}