package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication{
	@GetMapping(value = ["/saad/first"])
	fun hi(): String{
		return "This is the first Kotlin project by Saad for Hepster"
	}
}
fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}