package com.nba.kmm_2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform