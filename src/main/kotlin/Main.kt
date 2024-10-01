package code.com

import code.com.controller.Hello
import code.com.controller.hello
import java.io.FileWriter

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val a = Hello().hello()
    for (i in a) {
        println(i)
    }
}