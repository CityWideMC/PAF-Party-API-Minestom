plugins {
    id("java")
    id ("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "me.heroostech.exampleextension"
version = "v1.0.0"

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly(libs.minestom)
    implementation(libs.citystom)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}