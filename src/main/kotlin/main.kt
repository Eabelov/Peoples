fun main() {
    val likes = 1
    if (likes < 100) {
        if (likes == 1 || (likes % 10) == 1 && likes != 11){
            println("Понравилось $likes человеку")
        } else {
            println("Понравилось $likes людям")
        }
    } else {
        if ((likes % 100) == 11) {
            println("Понравилось $likes людям")
        } else {
            println("Понравилось $likes человеку")
        }
    }
}