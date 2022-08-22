open class Literature(
    titulo: String,
    copyright: String = "",
    val editorial: String
) : CreativeWork(titulo, copyright)
{
    override fun equals(other: Any?): Boolean =
        other is Literature &&
        other.titulo == this.titulo &&
        other.copyright == copyright &&
        other.editorial == editorial

    override fun toString(): String = ""
    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + editorial.hashCode()
        return result
    }

}