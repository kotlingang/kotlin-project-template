@file:Suppress("FunctionName", "MemberVisibilityCanBePrivate")

object Dependencies {
    const val Self = "dependencies:dependencies:SNAPSHOT"

    object Kotlin {
        val Plugin = Plugin()
        fun Plugin(version: String = Version.KOTLIN) = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
        const val Jvm = "org.jetbrains.kotlin.jvm"
        const val Js = "org.jetbrains.kotlin.js"
    }
}