import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType

tasks.withType<Test> {
  useJUnitPlatform()
  options {
    jvmArgs("-XX:SoftRefLRUPolicyMSPerMB=0", "-XX:+UseParallelGC", "-noverify")
  }
  testLogging {
    events("skipped", "failed")
    setExceptionFormat("full")
    showCauses = true
    showExceptions = true
    showStackTraces = true
  }
}
