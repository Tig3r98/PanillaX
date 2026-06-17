plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation("io.papermc.paperweight.userdev:io.papermc.paperweight.userdev.gradle.plugin:${libs.versions.paperweight.userdev.get()}")
    implementation("com.gradleup.shadow:shadow-gradle-plugin:${libs.versions.shadow.get()}")
}