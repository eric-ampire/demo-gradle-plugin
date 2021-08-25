package com.ericampire.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DownloadTask : DefaultTask() {

    @TaskAction
    fun downloading() {
        println("Downloading...")
    }
}