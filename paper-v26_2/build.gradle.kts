plugins {
    id("paperweight-conventions")
}

dependencies {
    compileOnly(project(":panillax-api"))

    paperweight.paperDevBundle(libs.versions.paper.api)

    implementation(libs.kyori.serializer.ansi)
    implementation(libs.nbtapi)
}