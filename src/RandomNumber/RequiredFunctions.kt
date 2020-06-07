package RandomNumber

fun randomNumber() : Int {
    return java.util.Random().nextInt(20) + 1
}

fun displayOnSuccessGuess(noOfSteps : Int) {
    println("Congrats!!! you guessed the Magic Number in $noOfSteps....Thanks for playing!!!")
}