package pieces

class SPiece : Tetromino() {
    override val color = "\u001B[38;5;47m"
    override val shape = listOf(listOf(false,true,true),listOf(true,true,false))
}