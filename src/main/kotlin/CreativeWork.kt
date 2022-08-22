open class CreativeWork(
    val titulo: String,
    val copyright: String = "")
{
    override fun equals(other: Any?): Boolean =
        other is CreativeWork &&
        other.titulo == this.titulo &&
        other.copyright == this.copyright

    override fun toString(): String = "CreativeWork { title: $titulo," +
            "copyright: $copyright"

    fun hasCopyright(): Boolean = (this.copyright == "")
    override fun hashCode(): Int {
        var result = titulo.hashCode()
        result = 31 * result + copyright.hashCode()
        return result
    }

}