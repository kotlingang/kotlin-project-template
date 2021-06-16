import org.gradle.api.Plugin
import org.gradle.api.Project


class KotlinJvmConfiguration : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(Dependencies.Kotlin.Jvm)
        target.plugins.apply("dependencies")
    }
}