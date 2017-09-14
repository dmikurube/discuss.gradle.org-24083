import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.bundling.Jar

class MyJar extends Jar {
    MyJar() {
        // targetResourceInto is not configured yet...
    }

    @TaskAction @Override void copy() {
        into targetResourceInto, {
            from {
                project.configurations.target
            }
        }
    }

    String targetResourceInto
}
