package com.otakushelter

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build().apply {
        args(*args)
        packages("com.otakushelter")
    }.start()
}

