import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    validateInput(args)
    val decodedStringAsByteArray = Base64.getDecoder().decode(args[0])
    println(String(decodedStringAsByteArray))
}

fun validateInput(args: Array<String>) {
    if (args.isEmpty()) {
        println("You need to enter the string you'd like to decode.")
        exitProcess(0)
    }
}
