package org.green.deploy;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class DeployerTask extends DefaultTask {
    @TaskAction
    public void taskAction() {
        System.out.println("Hello from Deployer2");
        System.out.println("Project     : " + getProject());
        System.out.println("Name        : " + getName());
        System.out.println("Path        : " + getPath());
        System.out.println("IdentityPath: " + getIdentityPath());
        System.out.println("TaskIdentity: " + getTaskIdentity());
        System.out.println("Description : " + getDescription());
        System.out.println("Group       : " + getGroup());
        System.out.println("TmpDir      : " + getTemporaryDir());
    }
}
