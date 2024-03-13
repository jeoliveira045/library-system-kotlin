import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.22"
	kotlin("plugin.spring") version "1.9.22"
	kotlin("plugin.jpa") version "1.9.22"
//    val kotlinVersion: String by System.getProperties()
//    kotlin("plugin.serialization") version kotlinVersion
//    kotlin("multiplatform") version kotlinVersion
//    val kvisionVersion: String by System.getProperties()
//    id("io.kvision") version kvisionVersion
}


repositories {
    mavenCentral()
    mavenLocal()
}

// Versions
val kotlinVersion: String by System.getProperties()
val kvisionVersion: String by System.getProperties()

group = "project"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}
//kotlin {
//    js(IR) {
//        browser {
//            runTask(Action {
//                mainOutputFileName = "main.bundle.js"
//                sourceMaps = false
//                devServer = KotlinWebpackConfig.DevServer(
//                    open = false,
//                    port = 3000,
//                    proxy = mutableMapOf(
//                        "/kv/*" to "http://localhost:8080",
//                        "/kvws/*" to mapOf("target" to "ws://localhost:8080", "ws" to true)
//                    ),
//                    static = mutableListOf("$buildDir/processedResources/js/main")
//                )
//            })
//            webpackTask(Action {
//                mainOutputFileName = "main.bundle.js"
//            })
//            testTask(Action {
//                useKarma {
//                    useChromeHeadless()
//                }
//            })
//        }
//        binaries.executable()
//    }
//    sourceSets["jsMain"].dependencies {
//        implementation("io.kvision:kvision:$kvisionVersion")
//        implementation("io.kvision:kvision-bootstrap:$kvisionVersion")
//        implementation("io.kvision:kvision-i18n:$kvisionVersion")
//    }
//    sourceSets["jsTest"].dependencies {
//        implementation(kotlin("test-js"))
//        implementation("io.kvision:kvision-testutils:$kvisionVersion")
//    }
//}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	runtimeOnly("com.oracle.database.jdbc:ojdbc11")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
