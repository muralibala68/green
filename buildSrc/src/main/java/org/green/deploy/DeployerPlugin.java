package org.green.deploy;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DeployerPlugin implements Plugin {
    @Override
    public void apply(Object object) {
        final Project project = (Project) object;
        project.getTasks().create("hello3", DeployerTask.class);
    }
}
