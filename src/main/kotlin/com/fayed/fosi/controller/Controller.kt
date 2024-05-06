package com.fayed.fosi.controller

import com.fayed.fosi.service.WelcomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller (private val welcomeService: WelcomeService){

    @GetMapping("/")
    fun home(): String {
        return welcomeService.mainPage()
    }
}