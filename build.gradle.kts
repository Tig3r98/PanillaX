allprojects {
    group = "com.ruinscraft"
    version = findProperty("version") as String
}

tasks.register<Delete>("clean") {
    description = "Cleans the target directory."

    delete("./target")
}