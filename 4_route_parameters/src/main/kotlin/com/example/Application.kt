package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    routing {
        get("/user/{login}") {
            if (call.parameters["login"] == "admin") {
                call.respondText("You are logged in as Admin")
            }
        }
    }
}
