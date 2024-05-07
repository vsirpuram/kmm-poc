package com.example.kmm_2

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("World"), "Check 'World' is mentioned")
    }
}