plugins {
    `kotlin-dsl`
    id("dependencies")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.Self)
    // Used to prevent classpath conflicts
    compileOnly(Dependencies.Kotlin.Plugin(version = "1.4.20"))
    runtimeOnly(Dependencies.Kotlin.Plugin)
}

gradlePlugin {
    plugins.register("k-mpp") {
        id = "k-mpp"
        implementationClass = "KotlinMultiplatformConfiguration"
    }
    plugins.register("k-jvm") {
        id = "k-jvm"
        implementationClass = "KotlinJvmConfiguration"
    }
    plugins.register("k-js") {
        id = "k-js"
        implementationClass = "KotlinJvmConfiguration"
    }
}
