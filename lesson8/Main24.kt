import org.w3c.dom.Text

fun main() {
    print("Enter text: ")
    val text = readLine().toString()

    uppercase(text)
}

fun uppercase(text: String) = println(text.uppercase())