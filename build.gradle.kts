import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.30"
    application
    `maven-publish`
    id("java-gradle-plugin")
}

group = "com.ericampire"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

gradlePlugin {
    plugins {
        create("LogPlugin") {
            id = "com.ericampire.plugin"
            implementationClass = "com.ericampire.plugin.LogPlugin"
            version = "1.0.0"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.ericampire.plugin"
            artifactId = "log"
            version = "1.1"
            from(components["kotlin"])
        }
    }
}