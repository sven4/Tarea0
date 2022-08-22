class Novel(
    titulo: String,
    copyright: String = "",
    editorial: String,
    val autor: String
) : Literature(titulo, copyright, editorial)