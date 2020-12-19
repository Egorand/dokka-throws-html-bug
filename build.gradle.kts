plugins {
    kotlin("jvm") version "1.4.21"
    id("org.jetbrains.dokka") version "1.4.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}
