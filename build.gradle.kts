import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    id("idea")
    id("org.jetbrains.kotlin.jvm")
}

application {
    mainClassName = "com.github.vacxe.samplekotlincli.MainKt"
    applicationName = "samplekotlincli"
}

repositories {
    jcenter()
    maven("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:28.2-jre")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit:junit:4.12")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
