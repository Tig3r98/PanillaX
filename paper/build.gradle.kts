plugins {
    id("shadow-conventions")
}

dependencies {
    implementation(project(":panillax-api"))
    implementation(project(":panillax-paper-v26_2"))

    compileOnly(libs.paper.api)
    implementation(libs.bstats)
}

tasks.withType<ProcessResources> {
    filesMatching("**plugin.yml") {
        expand(
            mapOf(
                "version" to project.parent?.version
            )
        )
    }
}