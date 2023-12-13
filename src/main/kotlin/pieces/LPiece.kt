package pieces

class LPiece() : Tetromino() {
    override val color = "\u001B[38;5;214m"
    override val shape = listOf(listOf(false,true,false),listOf(false,true,false),listOf(false,true,true))

}