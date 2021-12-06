package com.example.restservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinHelloWebserviceApplication

fun main(args: Array<String>) {
    runApplication<KotlinHelloWebserviceApplication>(*args)
}
