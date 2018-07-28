import com.github.benmanes.gradle.versions.updates.DependencyUpdates
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.gradle.api.JavaVersion
import org.gradle.api.artifacts.ResolutionStrategy
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.kotlin.dsl.closureOf
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.springframework.boot.gradle.tasks.run.BootRun
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

version = "1.0.0-SNAPSHOT"

apply { from("$rootDir/gradle/dependencies.gradle.kts") }

val versions = extra["versions"] as Map<*, *>
val libraries = extra["libraries"] as Map<*, *>
val testLibraries = extra["testLibraries"] as Map<*, *>

plugins {
  kotlin("jvm") version "1.2.51"
  idea
  id("com.gorylenko.gradle-git-properties") version "1.5.1"
  id("org.springframework.boot") version "2.0.3.RELEASE"
  id("com.github.ben-manes.versions") version "0.20.0"
}

repositories {
  mavenLocal()
  jcenter()
  maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots/") }
}

ext["thymeleaf.version"] = versions["thymeleaf"]
ext["thymeleaf-layout-dialect.version"] = versions["thymeleaf-layout-dialect"]

dependencies {
  compileOnly(libraries["spring-context-indexer"] as String)

  compile(libraries["spring-boot-starter-data-mongodb-reactive"] as String)
  compile(libraries["spring-boot-starter-data-rest"] as String)
  compile(libraries["spring-boot-starter-webflux"] as String)
  compile(libraries["spring-boot-starter-breuninger-core"] as String)
  compile(libraries["spring-boot-starter-breuninger-jobs"] as String)
  compile(libraries["spring-boot-starter-breuninger-mongo"] as String)
  compile(libraries["spring-boot-starter-breuninger-togglz"] as String)

  compile(libraries["kotlin-stdlib"] as String)
  compile(libraries["kotlin-stdlib-jre8"] as String)
  compile(libraries["kotlin-stdlib-jre7"] as String)
  compile(libraries["kotlin-reflect"] as String)
  compile(libraries["jackson-module-kotlin"] as String)

  compile(libraries["spring-boot-devtools"] as String)

  testCompile(testLibraries["embed-mongo"] as String)
  testCompile(testLibraries["spring-boot-starter-breuninger-testsupport"] as String)
  testCompile(testLibraries["spring-boot-starter-test"] as String)

  testCompile(testLibraries["reactor-test"] as String)
  testCompile(testLibraries["mockito-kotlin"] as String)
  testCompile(testLibraries["hamkrest"] as String)
}

apply {
  from("$rootDir/gradle/test.gradle.kts")
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

tasks {
  withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = org.gradle.api.JavaVersion.VERSION_1_8.toString()
    }
  }

  getByName<BootRun>("bootRun") {
    systemProperties = System.getProperties().mapKeys { entry -> entry.key.toString() }.toMap()
  }
}
