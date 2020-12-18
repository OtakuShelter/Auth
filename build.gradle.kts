plugins {
    kotlin("jvm") version "1.4.10" apply false
    kotlin("kapt") version "1.4.10" apply false
    kotlin("plugin.allopen") version "1.4.10" apply false
    id("com.github.johnrengelman.shadow") version "6.1.0" apply false
    id("io.micronaut.application") version "1.2.0" apply false
}

version = "0.1"
group = "com.otakushelter"

allprojects {
    repositories {
        mavenCentral()
        jcenter()
    }
}