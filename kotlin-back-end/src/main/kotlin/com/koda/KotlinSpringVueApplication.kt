package com.koda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringVueApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringVueApplication>(*args)
}
