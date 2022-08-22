class Movie(
    titulo: String,
    copyright: String = "",
    val director: String,
    val guionista: String,
    val elenco: Array<String>
) : CreativeWork(titulo, copyright)
