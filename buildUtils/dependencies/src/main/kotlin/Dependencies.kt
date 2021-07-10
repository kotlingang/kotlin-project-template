@file:Suppress("FunctionName", "unused")

object Deps {
    private const val kotlinVersion = "1.5.0"
    private const val coroutinesVersion = "1.5.0"
    private const val serializationVersion = "1.2.2"
    private const val nodejsExternalsVersion = "0.0.7"
    private const val ktorVersion = "1.6.0"
    private const val ktorOpenapiVersion = "0.2-beta.18"
    private const val exposedVersion = "0.32.1"
    private const val datetimeVersion = "0.2.1"

    private const val postgresqlVersion = "42.2.23"
    private const val slf4jJVersion = "1.7.31"

    private const val androidGradlePluginVersion = "4.2.0"

    object Libs {
        object Kotlinx {
            const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val Serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
            const val Datetime = "org.jetbrains.kotlinx:kotlinx-datetime:$datetimeVersion"
            const val Nodejs = "org.jetbrains.kotlinx:kotlinx-nodejs:$nodejsExternalsVersion"
        }
        object Ktor {
            const val Core = "io.ktor:ktor-client-core:$ktorVersion"
            const val Cio = "io.ktor:ktor-client-cio:$ktorVersion"
            const val Serialization = "io.ktor:ktor-client-serialization:$ktorVersion"
            const val Openapi = "com.github.papsign:Ktor-OpenAPI-Generator:$ktorOpenapiVersion"
        }
        object Exposed {
            const val Core = "org.jetbrains.exposed:exposed-core:$exposedVersion"
            const val Jdbc = "org.jetbrains.exposed:exposed-jdbc:$exposedVersion"
            const val Time = "org.jetbrains.exposed:exposed-java-time:$exposedVersion"
        }
        object Postgres {
            const val Driver = "org.postgresql:postgresql:$postgresqlVersion"
        }
        object Slf4j {
            const val Simple = "org.slf4j:slf4j-simple:$slf4jJVersion"
        }
    }
    object Plugins {
        object Dependencies {
            const val Id = "dependencies"
            const val Classpath = "dependencies:dependencies:SNAPSHOT"
        }
        object Kotlin {
            const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
            const val Jvm = "org.jetbrains.kotlin.jvm"
            const val Js = "org.jetbrains.kotlin.js"
            const val Android = "org.jetbrains.kotlin.android"
            const val Classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        }
        object Android {
            const val Application = "com.android.application"
            const val Library = "com.android.library"
            const val Classpath = "com.android.tools.build:gradle:$androidGradlePluginVersion"
        }
    }
}
