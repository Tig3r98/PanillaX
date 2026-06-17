plugins {
    id("java-conventions")
    id("com.gradleup.shadow")
}

tasks.shadowJar {
    relocate("de.tr7zw.changeme.nbtapi", "com.ruinscraft.panilla.lib.nbtapi")
    relocate("org.bstats", "com.ruinscraft.panilla.lib.bstats")

    archiveFileName.set("PanillaX-${project.version}.jar")
    destinationDirectory.set(rootProject.layout.projectDirectory.dir("target"))
}

tasks.build {
    dependsOn(tasks.shadowJar)
}