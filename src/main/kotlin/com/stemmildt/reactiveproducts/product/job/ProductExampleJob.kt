package com.stemmildt.reactiveproducts.product.job

import com.breuninger.boot.jobs.definition.DefaultJobDefinition.cronJobDefinition
import com.breuninger.boot.jobs.definition.JobDefinition
import com.breuninger.boot.jobs.service.JobRunnable
import org.springframework.stereotype.Component
import java.util.Optional

@Component
class ExampleJob : JobRunnable {

  override fun getJobDefinition(): JobDefinition = cronJobDefinition(
    JOB_TYPE,
    JOB_TYPE,
    "just an example job.",
    "0 0/2 * ? * *",
    0,
    Optional.empty())

  override fun execute(): Boolean = true

  companion object {

    private val JOB_TYPE = "ExampleJob"
  }
}
