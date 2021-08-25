package com.ericampire.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class UploadTask : DefaultTask() {

    @TaskAction
    fun uploading() {
        println("Uploading")
    }
}