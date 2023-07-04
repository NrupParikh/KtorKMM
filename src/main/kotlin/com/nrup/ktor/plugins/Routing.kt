package com.nrup.ktor.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import randomRabbit

fun Application.configureRouting() {
    
    routing {
        randomRabbit()
//        get("/") {
//            call.respondText("Hello World! This is Nrup Parikh")
//        }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
