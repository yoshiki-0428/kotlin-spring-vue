package com.koda.Controller

import com.koda.Entity.Todo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    // イコールでつなげると返却する型を推定する
    @GetMapping("hello")
    fun hello() = "Hello Kotlin !"

    @GetMapping("list")
    // fun: メソッド宣言 : 返却する値
    fun getHelloList(): MutableList<String> {
        // return mutableListOf("hello", "こんにちは", "コップンカー")
        val helloList = mutableListOf("hello", "こんにちは", "コップンカー")
        return helloList
    }

    @GetMapping("todo")
    fun getTodo(): Todo {
        return Todo(0, "git", "git clone")
    }
}