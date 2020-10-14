plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application.mainClassName = "AppKt"

dependencies {
//    implementation(kotlin("stdlib"))
}
