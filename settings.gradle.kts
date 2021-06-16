pluginManagement {
    repositories {
        gradlePluginPortal()
        // Uncomment when using android
//        google()
    }
}

rootProject.name = "kotlin-project-template"

includeBuild("buildUtils/dependencies")
includeBuild("buildUtils/configuration")
