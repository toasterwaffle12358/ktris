//imports
import pieces.*
import java.lang.reflect.Constructor
import kotlin.random.Random

fun main(args: Array<String>) {

    //initializing basic values
    val colorReset = "\u001B[38;5;15m"
    val playSpace = PlaySpace().playSpaceList

    //function for getting next random piece


    //function for adding piece into board
    fun addPiece() {
        for ((rowIndex, piecePixelRow) in SquarePiece().shape.withIndex()) {
            for ((index, piecePixel) in piecePixelRow.withIndex()) {
                if (piecePixel){
                    playSpace[rowIndex][3+index] = "${SquarePiece().color} ▩ $colorReset"
                }
            }
        }
    }

    // function for printing board
    fun printBoard() {
        for (boardRow in playSpace) {
            print("╣")
            for (spot in boardRow) {
                print(spot)
            }
            print("╠")
            println()
        }
    }

    //function for making piece fall


    //game
    addPiece()
    while(true) {
        printBoard()
        println("")
        Thread.sleep(1_000)
    }

}