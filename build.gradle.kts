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

buildscript {
  project.apply {
    from("$rootDir/gradle/dependencies.gradle.kts")
  }
  val gradlePlugins = extra["gradlePlugins"] as Map<*, *>

  repositories {
    maven { setUrl("https://plugins.gradle.org/m2/") }
    mavenCentral()
    jcenter()
    maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots/") }
    maven { setUrl("https://jitpack.io") }
  }
  dependencies {
    classpath(gradlePlugins["kotlin-gradle-plugin"] as String)
    classpath(gradlePlugins["kotlin-allopen"] as String)
    classpath(gradlePlugins["kotlin-noarg"] as String)
    classpath(gradlePlugins["spring-boot"] as String)
    classpath(gradlePlugins["versions"] as String)
    classpath(gradlePlugins["git-properties"] as String)
  }
}

apply {
  plugin("idea")
  plugin("kotlin")
  plugin("kotlin-spring")
  plugin("org.springframework.boot")
  plugin("io.spring.dependency-management")
  plugin("com.github.ben-manes.versions")
  plugin("com.gorylenko.gradle-git-properties")
}

repositories {
  mavenCentral()
  jcenter()
  maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots/") }
  maven { setUrl("https://jitpack.io") }
}

val versions = extra["versions"] as Map<*, *>
val libraries = extra["libraries"] as Map<*, *>
val testLibraries = extra["testLibraries"] as Map<*, *>

ext["groovy.version"] = versions["groovy"]
ext["thymeleaf.version"] = versions["thymeleaf"]
ext["thymeleaf-layout-dialect.version"] = versions["thymeleaf-layout-dialect"]

val compile by configurations
val compileOnly by configurations
val testCompile by configurations

dependencies {
  compileOnly(libraries["spring-context-indexer"] as String)

  compile(libraries["spring-boot-starter-data-mongodb-reactive"] as String)
  compile(libraries["spring-boot-starter-data-rest"] as String)
  compile(libraries["spring-boot-starter-webflux"] as String)
  compile(libraries["spring-boot-starter-breuninger-core"] as String)
  compile(libraries["spring-boot-starter-breuninger-jobs"] as String)
  compile(libraries["spring-boot-starter-breuninger-mongo"] as String)
  compile(libraries["spring-boot-starter-breuninger-togglz"] as String)

  compile(libraries["kotlin-stdlib-jre8"] as String)
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
      freeCompilerArgs = listOf("-Xjsr305=strict")
      jvmTarget = org.gradle.api.JavaVersion.VERSION_1_8.toString()
    }
  }

  getByName<BootRun>("bootRun") {
    systemProperties = System.getProperties().mapKeys { entry -> entry.key.toString() }.toMap()
  }
}
