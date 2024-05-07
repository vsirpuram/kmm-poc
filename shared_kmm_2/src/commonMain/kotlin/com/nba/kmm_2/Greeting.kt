package com.nba.kmm_2

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello World, This is ${platform.name}!"
    }

    fun printName(name: String): String {
        return "Hello ${name}, Good Afternoon!!! How are you doing?"
    }
}