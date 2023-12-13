package pieces

class ReverseSPiece : Tetromino() {
    override val color = "\u001B[38;5;202m"
    override val shape = listOf(listOf(true,true,false),listOf(false,true,true))
}