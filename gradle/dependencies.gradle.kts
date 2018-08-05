val versions = mapOf(
  "kotlin" to "1.2.60",
  "thymeleaf" to "3.0.9.RELEASE",
  "thymeleaf-layout-dialect" to "2.3.0",
  "lombok" to "1.18.2",
  "findbugs" to "3.0.1",
  "spring" to "5.0.8.RELEASE",
  "hibernate-validator" to "6.0.11.Final",
  "owasp-java-html-sanitizer" to "20171016.1",
  "spring-boot" to "2.0.4.RELEASE",
  "spring-boot-starter-breuninger" to "2.0.3.RELEASE",
  "edison-hal" to "2.0.1",
  "jongo" to "1.4.0",
  "bson4jackson" to "2.9.0",
  "edison-vault" to "2.0.4",
  "handy-uri-templates" to "2.1.6",
  "httpclient" to "4.5.5",
  "jackson-module-kotlin" to "2.9.6",
  "groovy" to "2.5.1"
)
val testVersions = mapOf(
  "embed-mongo" to "2.1.1",
  "mockito-core" to "2.20.1",
  "hamcrest-optional" to "1.0",
  "reactor" to "3.1.8.RELEASE",
  "mockito-kotlin" to "1.6.0",
  "hamkrest" to "1.4.2.2"
)
val pluginVersions = mapOf(
  "versions" to "0.20.0",
  "git-properties" to "1.5.1",
  "checkstyle" to "8.9",
  "jacoco" to "0.8.1",
  "pmd" to "5.8.1"
)

val libraries = mapOf(
  "lombok" to "org.projectlombok:lombok:${versions["lombok"]}",
  "kotlin-stdlib" to "org.jetbrains.kotlin:kotlin-stdlib:${versions["kotlin"]}",
  "kotlin-stdlib-jre8" to "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${versions["kotlin"]}",
  "kotlin-stdlib-jre7" to "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${versions["kotlin"]}",
  "kotlin-reflect" to "org.jetbrains.kotlin:kotlin-reflect:${versions["kotlin"]}",
  "jackson-module-kotlin" to "com.fasterxml.jackson.module:jackson-module-kotlin:${versions["jackson-module-kotlin"]}",
  "findbugs-annotations" to "com.google.code.findbugs:annotations:${versions["findbugs"]}",
  "spring-context-indexer" to "org.springframework:spring-context-indexer:${versions["spring"]}",
  "spring-context-support" to "org.springframework:spring-context-support:${versions["spring"]}",
  "spring-boot-starter-data-mongodb-reactive" to "org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${versions["spring-boot"]}",
  "spring-boot-starter-data-rest" to "org.springframework.boot:spring-boot-starter-data-rest:${versions["spring-boot"]}",
  "spring-boot-starter-webflux" to "org.springframework.boot:spring-boot-starter-webflux:${versions["spring-boot"]}",
  "hibernate-validator" to "org.hibernate:hibernate-validator:${versions["hibernate-validator"]}",
  "owasp-java-html-sanitizer" to "com.googlecode.owasp-java-html-sanitizer:owasp-java-html-sanitizer:${versions["owasp-java-html-sanitizer"]}",
  "spring-boot-starter-web" to "org.springframework.boot:spring-boot-starter-web:${versions["spring-boot"]}",
  "spring-boot-starter-actuator" to "org.springframework.boot:spring-boot-starter-actuator:${versions["spring-boot"]}",
  "spring-boot-starter-thymeleaf" to "org.springframework.boot:spring-boot-starter-thymeleaf:${versions["spring-boot"]}",
  "spring-boot-starter-json" to "org.springframework.boot:spring-boot-starter-json:${versions["spring-boot"]}",
  "spring-boot-starter" to "org.springframework.boot:spring-boot-starter:${versions["spring-boot"]}",
  "spring-boot-starter-logging" to "org.springframework.boot:spring-boot-starter-logging:${versions["spring-boot"]}",
  "spring-boot-starter-breuninger-core" to "com.breuninger.boot:spring-boot-starter-breuninger-core:${versions["spring-boot-starter-breuninger"]}",
  "spring-boot-starter-breuninger-jobs" to "com.breuninger.boot:spring-boot-starter-breuninger-jobs:${versions["spring-boot-starter-breuninger"]}",
  "spring-boot-starter-breuninger-mongo" to "com.breuninger.boot:spring-boot-starter-breuninger-mongo:${versions["spring-boot-starter-breuninger"]}",
  "spring-boot-starter-breuninger-togglz" to "com.breuninger.boot:spring-boot-starter-breuninger-togglz:${versions["spring-boot-starter-breuninger"]}",
  "edison-hal" to "de.otto.edison:edison-hal:${versions["edison-hal"]}",
  "jongo" to "org.jongo:jongo:${versions["jongo"]}",
  "bson4jackson" to "de.undercouch:bson4jackson:${versions["bson4jackson"]}",
  "edison-vault" to "de.otto.edison:edison-vault:${versions["edison-vault"]}",
  "handy-uri-templates" to "com.damnhandy:handy-uri-templates:${versions["handy-uri-templates"]}",
  "httpclient" to "org.apache.httpcomponents:httpclient:${versions["httpclient"]}",
  "spring-boot-devtools" to "org.springframework.boot:spring-boot-devtools:${versions["spring-boot"]}"
)
val testLibraries = mapOf(
  "embed-mongo" to "de.flapdoodle.embed:de.flapdoodle.embed.mongo:${testVersions["embed-mongo"]}",
  "mockito-core" to "org.mockito:mockito-core:${testVersions["mockito-core"]}",
  "spring-boot-starter-breuninger-testsupport" to "com.breuninger.boot:spring-boot-starter-breuninger-testsupport:${versions["spring-boot-starter-breuninger"]}",
  "hamcrest-optional" to "com.github.baev:hamcrest-optional:${testVersions["hamcrest-optional"]}",
  "spring-boot-starter-test" to "org.springframework.boot:spring-boot-starter-test:${versions["spring-boot"]}",
  "reactor-test" to "io.projectreactor:reactor-test:${testVersions["reactor"]}",
  "mockito-kotlin" to "com.nhaarman:mockito-kotlin:${testVersions["mockito-kotlin"]}",
  "hamkrest" to "com.natpryce:hamkrest:${testVersions["hamkrest"]}"
)

val gradlePlugins = mapOf(
  "kotlin-gradle-plugin" to "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["kotlin"]}",
  "kotlin-allopen" to "org.jetbrains.kotlin:kotlin-allopen:${versions["kotlin"]}",
  "kotlin-noarg" to "org.jetbrains.kotlin:kotlin-noarg:${versions["kotlin"]}",
  "spring-boot" to "org.springframework.boot:spring-boot-gradle-plugin:${versions["spring-boot"]}",
  "versions" to "com.github.ben-manes:gradle-versions-plugin:${pluginVersions["versions"]}",
  "git-properties" to "gradle.plugin.com.gorylenko.gradle-git-properties:gradle-git-properties:${pluginVersions["git-properties"]}"
)

extra["versions"] = versions
extra["testVersions"] = testVersions
extra["pluginVersions"] = pluginVersions

extra["libraries"] = libraries
extra["testLibraries"] = testLibraries

extra["gradlePlugins"] = gradlePlugins
