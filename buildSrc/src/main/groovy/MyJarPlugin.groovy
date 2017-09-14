import org.gradle.api.Plugin
import org.gradle.api.Project

class MyJarPlugin implements Plugin<Project> {
    @Override
    void apply(final Project project) {
        final MyJar myJarTask = project.tasks.create("myJar", MyJar)
    }
}
