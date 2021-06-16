@file:Suppress("FunctionName", "MemberVisibilityCanBePrivate")

object Dependencies {
    const val Self = "dependencies:dependencies:SNAPSHOT"

    object Kotlin {
        val Plugin = Plugin()
        fun Plugin(version: String = Version.KOTLIN) = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
        const val Jvm = "org.jetbrains.kotlin.jvm"
        const val Js = "org.jetbrains.kotlin.js"
        const val Android = "org.jetbrains.kotlin.android"
    }

    object Android {
        const val Plugin = "com.android.tools.build:gradle:${Version.ANDROID_GRADLE_PLUGIN}"
        const val Application = "com.android.application"
        const val Library = "com.android.library"
    }
}