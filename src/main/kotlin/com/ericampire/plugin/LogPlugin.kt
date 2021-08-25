package com.ericampire.plugin

import com.ericampire.plugin.task.DownloadTask
import com.ericampire.plugin.task.UploadTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class LogPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("upload", UploadTask::class.java)
        target.tasks.register("download", DownloadTask::class.java) { task ->
            task.dependsOn("upload")
        }
    }
}