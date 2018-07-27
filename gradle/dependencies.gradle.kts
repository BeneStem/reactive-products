val versions = mapOf(
  Pair("kotlin", "1.2.51"),
  Pair("thymeleaf", "3.0.9.RELEASE"),
  Pair("thymeleaf-layout-dialect", "2.3.0"),
  Pair("lombok", "1.16.22"),
  Pair("findbugs", "3.0.1"),
  Pair("spring", "5.0.7.RELEASE"),
  Pair("hibernate-validator", "6.0.9.Final"),
  Pair("owasp-java-html-sanitizer", "20171016.1"),
  Pair("spring-boot", "2.0.3.RELEASE"),
  Pair("spring-boot-starter-breuninger", "2.0.0-m2-SNAPSHOT"),
  Pair("edison-hal", "2.0.0-m1"),
  Pair("jongo", "1.4.0"),
  Pair("bson4jackson", "2.9.0"),
  Pair("edison-vault", "2.0.4"),
  Pair("handy-uri-templates", "2.1.6"),
  Pair("httpclient", "4.5.5"),
  Pair("jackson-module-kotlin", "2.9.6")
)
val testVersions = mapOf(
  Pair("embed-mongo", "2.1.1"),
  Pair("mockito-core", "2.18.0"),
  Pair("hamcrest-optional", "1.0"),
  Pair("reactor", "3.1.8.RELEASE"),
  Pair("mockito-kotlin", "1.5.0"),
  Pair("hamkrest", "1.4.2.2")
)
val pluginVersions = mapOf(
  Pair("git-properties", "1.5.1"),
  Pair("versions", "0.20.0"),
  Pair("checkstyle", "8.9"),
  Pair("jacoco", "0.8.1"),
  Pair("pmd", "5.8.1")
)

val libraries = mapOf(
  Pair("lombok", "org.projectlombok:lombok:${versions["lombok"]}"),
  Pair("kotlin-stdlib", "org.jetbrains.kotlin:kotlin-stdlib:${versions["kotlin"]}"),
  Pair("kotlin-stdlib-jre8", "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${versions["kotlin"]}"),
  Pair("kotlin-stdlib-jre7", "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${versions["kotlin"]}"),
  Pair("kotlin-reflect", "org.jetbrains.kotlin:kotlin-reflect:${versions["kotlin"]}"),
  Pair("jackson-module-kotlin", "com.fasterxml.jackson.module:jackson-module-kotlin:${versions["jackson-module-kotlin"]}"),
  Pair("findbugs-annotations", "com.google.code.findbugs:annotations:${versions["findbugs"]}"),
  Pair("spring-context-indexer", "org.springframework:spring-context-indexer:${versions["spring"]}"),
  Pair("spring-context-support", "org.springframework:spring-context-support:${versions["spring"]}"),
  Pair("spring-boot-starter-data-mongodb-reactive", "org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-data-rest", "org.springframework.boot:spring-boot-starter-data-rest:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-webflux", "org.springframework.boot:spring-boot-starter-webflux:${versions["spring-boot"]}"),
  Pair("hibernate-validator", "org.hibernate:hibernate-validator:${versions["hibernate-validator"]}"),
  Pair("owasp-java-html-sanitizer",
    "com.googlecode.owasp-java-html-sanitizer:owasp-java-html-sanitizer:${versions["owasp-java-html-sanitizer"]}"),
  Pair("spring-boot-starter-web", "org.springframework.boot:spring-boot-starter-web:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-actuator", "org.springframework.boot:spring-boot-starter-actuator:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-thymeleaf", "org.springframework.boot:spring-boot-starter-thymeleaf:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-json", "org.springframework.boot:spring-boot-starter-json:${versions["spring-boot"]}"),
  Pair("spring-boot-starter", "org.springframework.boot:spring-boot-starter:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-logging", "org.springframework.boot:spring-boot-starter-logging:${versions["spring-boot"]}"),
  Pair("spring-boot-starter-breuninger-core",
    "com.breuninger.boot:spring-boot-starter-breuninger-core:${versions["spring-boot-starter-breuninger"]}"),
  Pair("spring-boot-starter-breuninger-jobs",
    "com.breuninger.boot:spring-boot-starter-breuninger-jobs:${versions["spring-boot-starter-breuninger"]}"),
  Pair("spring-boot-starter-breuninger-mongo",
    "com.breuninger.boot:spring-boot-starter-breuninger-mongo:${versions["spring-boot-starter-breuninger"]}"),
  Pair("spring-boot-starter-breuninger-togglz",
    "com.breuninger.boot:spring-boot-starter-breuninger-togglz:${versions["spring-boot-starter-breuninger"]}"),
  Pair("edison-hal", "de.otto.edison:edison-hal:${versions["edison-hal"]}"),
  Pair("jongo", "org.jongo:jongo:${versions["jongo"]}"),
  Pair("bson4jackson", "de.undercouch:bson4jackson:${versions["bson4jackson"]}"),
  Pair("edison-vault", "de.otto.edison:edison-vault:${versions["edison-vault"]}"),
  Pair("handy-uri-templates", "com.damnhandy:handy-uri-templates:${versions["handy-uri-templates"]}"),
  Pair("httpclient", "org.apache.httpcomponents:httpclient:${versions["httpclient"]}"),
  Pair("spring-boot-devtools", "org.springframework.boot:spring-boot-devtools:${versions["spring-boot"]}")
)
val testLibraries = mapOf(
  Pair("embed-mongo", "de.flapdoodle.embed:de.flapdoodle.embed.mongo:${testVersions["embed-mongo"]}"),
  Pair("mockito-core", "org.mockito:mockito-core:${testVersions["mockito-core"]}"),
  Pair("spring-boot-starter-breuninger-testsupport",
    "com.breuninger.boot:spring-boot-starter-breuninger-testsupport:${versions["spring-boot-starter-breuninger"]}"),
  Pair("hamcrest-optional", "com.github.baev:hamcrest-optional:${testVersions["hamcrest-optional"]}"),
  Pair("spring-boot-starter-test", "org.springframework.boot:spring-boot-starter-test:${versions["spring-boot"]}"),
  Pair("reactor-test", "io.projectreactor:reactor-test:${testVersions["reactor"]}"),
  Pair("mockito-kotlin", "com.nhaarman:mockito-kotlin:${testVersions["mockito-kotlin"]}"),
  Pair("hamkrest", "com.natpryce:hamkrest:${testVersions["hamkrest"]}")
)

val gradlePlugins = mapOf(
  Pair("git-properties",
    "gradle.plugin.com.gorylenko.gradle-git-properties:gradle-git-properties:${pluginVersions["git-properties"]}"),
  Pair("spring-boot", "org.springframework.boot:spring-boot-gradle-plugin:${versions["spring-boot"]}"),
  Pair("versions", "com.github.ben-manes:gradle-versions-plugin:${pluginVersions["versions"]}"),
  Pair("kotlin-gradle-plugin", "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["kotlin"]}")
)

extra["versions"] = versions
extra["testVersions"] = testVersions
extra["pluginVersions"] = pluginVersions

extra["libraries"] = libraries
extra["testLibraries"] = testLibraries

extra["gradlePlugins"] = gradlePlugins
