plugins {
    id("java-conventions")
}

dependencies {
    compileOnly(libs.netty.all)
    compileOnly(libs.gson)
}