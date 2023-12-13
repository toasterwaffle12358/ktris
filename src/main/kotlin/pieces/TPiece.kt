package pieces

class TPiece : Tetromino() {
    override val color = "\u001B[38;5;129m"
    override val shape = listOf(listOf(false,true,false),listOf(true,true,true))
}