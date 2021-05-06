package com.github.foobarjohnny.mychchar.services

import com.github.foobarjohnny.mychchar.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
