package pieces

class ReverseLPiece : Tetromino() {
    override val color = "\u001B[38;5;27m"
    override val shape = listOf(listOf(false,true,false),listOf(false,true,false),listOf(true,true,false))
}