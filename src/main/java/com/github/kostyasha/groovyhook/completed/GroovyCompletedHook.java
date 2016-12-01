package com.github.kostyasha.groovyhook.completed;

import hudson.init.InitMilestone;
import hudson.init.Initializer;
import jenkins.model.Jenkins;
import jenkins.util.groovy.GroovyHookScript;

/**
 * @author Kanstantsin Shautsou
 */
public class GroovyCompletedHook {
    @Initializer(after = InitMilestone.COMPLETED)
    public static void init(Jenkins j) {
        new GroovyHookScript("completed", j.servletContext, j.getRootDir(), j.getPluginManager().uberClassLoader).run();
    }
}
