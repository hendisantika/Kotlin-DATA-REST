package com.hendisantika.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 19/01/17.
 */


@SpringBootApplication
class Application

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun hello() = helloService.hello()

    @GetMapping("/count")
    fun count() = helloService.count()

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}