plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "icu.ketal"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(11)
    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

application {
    mainClass.set("MainKt")
}
