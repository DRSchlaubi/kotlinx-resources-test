plugins {
    kotlin("multiplatform") version "1.8.20"
    id("com.goncalossilva.resources") version "0.3.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js(IR) {
        browser()
        nodejs()
    }
    macosArm64()
    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("com.goncalossilva:resources:0.3.2")
            }
        }

        named("jsTest") {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        named("jvmTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
