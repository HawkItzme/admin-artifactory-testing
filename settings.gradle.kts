pluginManagement {
    repositories {
        maven {
            url = uri("https://mytrail.jfrog.io/artifactory/admin-virtual-repo/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://mytrail.jfrog.io/artifactory/admin-virtual-repo/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
        }
    }
}

rootProject.name = "Admin Artifactory Testing App"
include(":app")
 