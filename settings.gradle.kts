pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

println("rootProject is: " + rootProject.name)

if (rootProject.name == "Terasology") {
    println("TeraRusty is embedded within Terasology, using nested paths")
    include (":libs:TeraRusty:core")
    include (":libs:TeraRusty:core-rust")
} else {
    println("TeraRusty is running standalone so using simple paths for includes")
    include("core")
    include("core-rust")
}