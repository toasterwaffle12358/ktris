//imports
import pieces.*

fun main(args: Array<String>) {

    //initializing basic values
    val colorreset = "\u001B[38;5;15m"

    //printing piece
    for (piecePixelRow in Lpiece().shape) {
        for (piecePixel in piecePixelRow) {
            if (piecePixel){
                print("${Lpiece().color}▩$colorreset")
            }
            print(" ")
        }
        println("")
    }

    //printing board
    for (boardrow in PlaySpace().playSpaceList) {
        print("╣")
        for (spot in boardrow) {
            print(spot)
        }
        print("╠")
        println()
    }
}