import org.gradle.api.Plugin
import org.gradle.api.Project


class KotlinAndroidLibraryConfiguration : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(Dependencies.Android.Library)
        target.plugins.apply(Dependencies.Kotlin.Android)
        target.plugins.apply("dependencies")
    }
}
