package com.fayed.fosi

import com.fayed.fosi.service.WelcomeService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class WelcomeServiceTests(@Autowired private val welcomeService: WelcomeService){
    @Test
    fun `Welcome Page is correctly returned`() {
        assertEquals("Main Page", welcomeService.mainPage())
    }
}