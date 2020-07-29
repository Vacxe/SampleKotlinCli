rootProject.name = "com.github.vacxe.samplekotlincli"
rootProject.buildFileName = "build.gradle.kts"

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0-rc")
    }
}
