import org.gradle.api.Plugin
import org.gradle.api.Project


class KotlinJsConfiguration : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(Dependencies.Kotlin.Js)
        target.plugins.apply("dependencies")
    }
}