plugins {
    kotlin("multiplatform") version "1.4.20-RC"
    kotlin("plugin.serialization") version "1.4.20-RC"
   `java-library`
}

repositories {
    mavenCentral()
    jcenter()
    google()
    maven{
        url = uri("https://kotlin.bintray.com/")
    }
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
     		implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.0")
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.0")
           }
        }
     }        

     iosX64("native") {
         binaries {
             framework {
                 baseName = "ClientDTOsX64"
	     }
         }
     }
}

tasks.withType<Wrapper> {
     gradleVersion = "7.0"
     distributionType = Wrapper.DistributionType.ALL
}


