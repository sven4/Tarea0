class Comic(
    titulo: String,
    copyright: String = "",
    editorial: String,
    val escritor: String,
    val artistas: Array<String>
) : Literature(titulo, copyright, editorial)