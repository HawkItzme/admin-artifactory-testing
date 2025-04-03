pluginManagement {
    repositories {
        maven {
            //Hybrid Solution Admin URL for Google Maven Artifacts
              //url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-admin-virtual-repo/")
            //Temporary testing
            url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-virtual-repo/")
            //Without Curation Catalog Admin Virtual Repo URL
            //url = uri("https://trialrzp461.jfrog.io/artifactory/proj1-admin-virtual-repo/")
            credentials {
                username = "musarif@ebay.com"
                password = "Mustafa@1234"
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            //Hybrid Solution Admin URL for Google Maven Artifacts
              //url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-admin-virtual-repo/")
            //Temporary testing
            url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-virtual-repo/")
            //Without Curation Catalog Admin Virtual Repo URL
            //url = uri("https://trialrzp461.jfrog.io/artifactory/proj1-admin-virtual-repo/")
            credentials {
                username = "musarif@ebay.com"
                password = "Mustafa@1234"
            }
        }
    }
}

rootProject.name = "Admin Artifactory Testing App"
include(":app")
 