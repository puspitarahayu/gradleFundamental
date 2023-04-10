
pluginManagement {
    repositories.gradlePluginPortal()
//    repositories.google()

    includeBuild("gradle/plugins")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
//    repositories.google()
}

/*
Jika tidak ada project name, maka nama project akan diambil dari nama folder
 */
rootProject.name = "my-project"

include("app")
include("business-logic")
include("data-model")