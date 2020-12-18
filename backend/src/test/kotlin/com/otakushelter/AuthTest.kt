package com.otakushelter

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class AuthTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Test
    fun testItWorks() {
        assertTrue(application.isRunning)
    }

}
