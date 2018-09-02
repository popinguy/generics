package kz.btsd.generics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenericsApplication

fun main(args: Array<String>) {
    runApplication<GenericsApplication>(*args)
}
