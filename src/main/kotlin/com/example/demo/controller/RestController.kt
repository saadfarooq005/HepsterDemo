package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RestController{
    @GetMapping(value = ["/saad/helloWorld"])
    fun helloWorld(): String{
        return "This is the Hello World Kotlin project by Saad for Hepster"
    }
}