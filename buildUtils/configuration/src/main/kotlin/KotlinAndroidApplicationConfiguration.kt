import org.gradle.api.Plugin
import org.gradle.api.Project


class KotlinAndroidApplicationConfiguration : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(Dependencies.Android.Application)
        target.plugins.apply(Dependencies.Kotlin.Android)
        target.plugins.apply("dependencies")
    }
}
