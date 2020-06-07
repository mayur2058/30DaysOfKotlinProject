/*
This project is created for 30DaysOfKotlin is a campaign from Google.
Name: Mayuresh Chougale
4 features of Kotlin used in this project is as follows:
1. String Template.
2. Data Class.
3. Named Parameter.
4. Null Safety while taking input.
*/



import RandomNumber.MagicNumber
import RandomNumber.displayOnSuccessGuess

fun main() {
    val no = MagicNumber();
    var inputNumber: Int
    var steps = 1

    print("You have to guess the Magic Number between 1 to 20 : ")

    do {
        inputNumber = readLine()!!.toInt()
        if(inputNumber > no.magicNumber) {
            println("Number is smaller")
            print("Try Again : ")
        }
        else if(inputNumber < no.magicNumber) {
            println("Number is greater")
            print("Try Again : ")
        }
        else {
            displayOnSuccessGuess(noOfSteps = steps)
        }
        steps++

    }while (inputNumber != no.magicNumber)
}