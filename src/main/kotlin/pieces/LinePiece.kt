package pieces

class LinePiece : Tetromino() {
    override val color = "\u001B[38;5;51m"
    override val shape = listOf(listOf(false,false,true,false),listOf(false,false,true,false),listOf(false,false,true,false),listOf(false,false,true,false))
}