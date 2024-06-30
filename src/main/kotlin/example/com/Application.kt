package example.com

import example.com.plugins.*
import io.ktor.server.application.*
import javax.lang.model.element.Modifier

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
