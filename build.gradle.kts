/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.4/samples
 */
plugins {
  id("com.github.node-gradle.node") version "2.2.4"
}

node {
  version    = '9.11.2'
  download = true
}

task build

build.dependsOn npm_build
