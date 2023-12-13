package pieces

class SquarePiece : Tetromino() {
    override val color = "\u001B[38;5;226m"
    override val shape = listOf(listOf(false,true,true,false),listOf(false,true,true,false))
}