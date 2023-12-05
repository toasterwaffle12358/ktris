class PlaySpace {
    val width = 10
    val height = 20
    val colorblack = "\u001B[30m"
    val colorreset = "\u001B[38;5;15m"

    val playSpaceList: MutableList<MutableList<String>> = mutableListOf(mutableListOf())
    init {
        for (i in 1..height) {
            var tempRowList: MutableList<String> = mutableListOf()
            for ( i in 1..width) {
                tempRowList.add("${colorblack} ■ $colorreset")
            }
            playSpaceList.add(tempRowList)
        }
        playSpaceList.removeFirst()
    }


}