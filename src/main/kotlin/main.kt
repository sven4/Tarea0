fun main(args: Array<String>)
{
    val novela1 = Novel("La llamada de C'thulu", editorial = "IVREA", autor = "Lovecraft")
    val novela2 = Novel("La llamada de C'thulu", editorial = "IVREA", autor = "H.P Lovecraft")

    println(novela1)
    if(novela1 == novela2)
        println("Son iguales")
    else
        println("Son distintos")
    println("hola mundo")
}