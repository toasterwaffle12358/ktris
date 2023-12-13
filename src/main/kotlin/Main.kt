//imports
import pieces.*
import kotlin.random.Random

fun main(args: Array<String>) {

    //initializing basic values
    val colorReset = "\u001B[38;5;15m"
    val playSpace = PlaySpace().playSpaceList
    val piecesList = listOf(LinePiece(),SquarePiece(),LPiece(),ReverseLPiece(),ReverseSPiece(),SPiece(),TPiece())

    //function for getting next random piece
    fun getNextPiece(): Tetromino {
        return piecesList[Random.nextInt(0, 7)]
    }

    //function for adding piece into board
    fun addPiece(currentPiece: Tetromino) {
        for ((rowIndex, piecePixelRow) in currentPiece.shape.withIndex()) {
            for ((index, piecePixel) in piecePixelRow.withIndex()) {
                if (piecePixel){
                    playSpace[rowIndex][3+index] = "${currentPiece.color} ▩ $colorReset"
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

    while(true) {
        addPiece(getNextPiece())
        printBoard()
        println("")
        Thread.sleep(1_000)
    }

}