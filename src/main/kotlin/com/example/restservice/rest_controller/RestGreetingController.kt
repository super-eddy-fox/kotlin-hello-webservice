package com.example.restservice.rest_controller

import com.example.restservice.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class RestGreetingController {
    private val template = "Hello, %s"
    private val counter = AtomicLong()

    @GetMapping("/rest/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "world") name:String): Greeting {
        return Greeting(counter.incrementAndGet(),String.format(template,name))
    }

}