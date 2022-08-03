package com.example

import com.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    routing {
        birdsRoutes()
    }
}
