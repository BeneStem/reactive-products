import org.gradle.api.JavaVersion
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
  val springVersion = "5.0.2.RELEASE"
  val springBootVersion = "2.0.0.M7"
  val kotlinVersion = "1.2.10"
  extra["springVersion"] = springVersion
  extra["springBootVersion"] = springBootVersion
  extra["kotlinVersion"] = kotlinVersion

  repositories {
    jcenter()
    maven { setUrl("https://repo.spring.io/milestone") }
  }
  dependencies {
    classpath("com.github.ben-manes:gradle-versions-plugin:0.17.0")
    classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
  }
}

apply {
  plugin("kotlin")
  plugin("idea")
  plugin("org.springframework.boot")
  plugin("io.spring.dependency-management")
}

version = "1.0.0-SNAPSHOT"
configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = org.gradle.api.JavaVersion.VERSION_1_8.toString()
  }
}

repositories {
  jcenter()
  maven { setUrl("https://repo.spring.io/milestone") }
}

val springVersion = extra["springVersion"] as String
val springBootVersion = extra["springBootVersion"] as String
val kotlinVersion = extra["kotlinVersion"] as String

dependencies {
  "compileOnly"("org.springframework:spring-context-indexer:$springVersion")

  "compile"("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:$springBootVersion")
  "compile"("org.springframework.boot:spring-boot-starter-data-rest:$springBootVersion")
  "compile"("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")

  "compile"("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
  "compile"("org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlinVersion")
  "compile"("org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlinVersion")
  "compile"("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
  "compile"("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.3")

  "runtime"("org.springframework.boot:spring-boot-devtools:$springBootVersion")

  "testCompile"("de.flapdoodle.embed:de.flapdoodle.embed.mongo:2.0.0")
  "testCompile"("io.projectreactor:reactor-test:3.1.2.RELEASE")
  "testCompile"("org.springframework.boot:spring-boot-starter-test:$springBootVersion")

  "testCompile"("com.nhaarman:mockito-kotlin:1.5.0")
  "testCompile"("com.natpryce:hamkrest:1.4.2.2")
}

apply {
  from("$rootDir/gradle/versions.gradle.kts")
  from("$rootDir/gradle/test.gradle.kts")
}
