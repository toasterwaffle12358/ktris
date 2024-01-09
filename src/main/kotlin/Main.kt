//imports
import pieces.*
import kotlin.random.Random
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.BorderLayout
import java.awt.Dimension

fun main(args: Array<String>) {

    //>------------------------< JFrame input capturing >------------------------<\\
    val frame = JFrame("no way omg")
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setSize(600, 400)
    frame.setVisible(true)


    //initializing basic values
    val colorReset = "\u001B[38;5;15m"
    var playSpace = PlaySpace().playSpaceList
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
    fun moveBoardDown() {
        val playSpaceOld = playSpace
        playSpace[0] = PlaySpace().playSpaceList[0]
        for (i in 1..19) {
            playSpace[i] = playSpaceOld[i-1]
        }
    }


    //function for rotating pieces

    //function to clear board
    fun clearBoard(): MutableList<MutableList<String>> {
        playSpace = PlaySpace().playSpaceList
        return playSpace
    }

    //game
    while(true) {
        playSpace = clearBoard()
        addPiece(getNextPiece())
        printBoard()
        println("")
        //moveBoardDown()
        Thread.sleep(1)
        readln()
    }

}