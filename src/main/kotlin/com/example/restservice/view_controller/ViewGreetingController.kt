package com.example.restservice.view_controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ViewGreetingController {

    @GetMapping("/view/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "world") name:String,model: Model):String{
        model.addAttribute("name",name)
        return "greeting"

    }
}