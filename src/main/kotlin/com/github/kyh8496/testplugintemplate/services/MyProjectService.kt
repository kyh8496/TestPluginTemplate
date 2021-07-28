package com.github.kyh8496.testplugintemplate.services

import com.github.kyh8496.testplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
