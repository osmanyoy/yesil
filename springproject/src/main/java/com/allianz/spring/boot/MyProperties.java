package com.allianz.spring.boot;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.prop")
public class MyProperties {

    private String              projectName;
    private String              projectVersion;
    private List<String>        modules;
    private Map<String, String> moduleVersions;

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(final String projectNameParam) {
        this.projectName = projectNameParam;
    }

    public String getProjectVersion() {
        return this.projectVersion;
    }

    public void setProjectVersion(final String projectVersionParam) {
        this.projectVersion = projectVersionParam;
    }

    public List<String> getModules() {
        return this.modules;
    }

    public void setModules(final List<String> modulesParam) {
        this.modules = modulesParam;
    }

    public Map<String, String> getModuleVersions() {
        return this.moduleVersions;
    }

    public void setModuleVersions(final Map<String, String> moduleVersionsParam) {
        this.moduleVersions = moduleVersionsParam;
    }


}
