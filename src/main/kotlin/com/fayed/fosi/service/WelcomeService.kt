package com.fayed.fosi.service

import org.springframework.stereotype.Service

@Service
class WelcomeService {
    fun mainPage(): String {
        return "Main Page"
    }
}