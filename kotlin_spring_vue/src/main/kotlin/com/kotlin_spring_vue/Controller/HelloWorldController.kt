package com.kotlin_spring_vue.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class HelloWorldController {

    @RestController
    class HelloWorldController {

        @GetMapping("/hello")
        fun hello() = "Hello Kotlin !"
    }
}