package com.stemmildt.reactiveproducts

import com.breuninger.boot.jobs.service.JobDefinitionService
import com.breuninger.boot.jobs.service.JobService
import org.springframework.context.annotation.Profile
import org.springframework.scheduling.annotation.SchedulingConfigurer
import org.springframework.scheduling.config.IntervalTask
import org.springframework.scheduling.config.ScheduledTaskRegistrar
import org.springframework.stereotype.Component
import java.time.Duration

@Component
@Profile("!test")
class JobWatcher(private val jobDefinitionService: JobDefinitionService,
                 private val jobService: JobService) : SchedulingConfigurer {

  override fun configureTasks(taskRegistrar: ScheduledTaskRegistrar) =
    jobDefinitionService.jobDefinitions.forEach {
      it.cron().ifPresent { cron -> registerCronJob(it.jobType(), cron, taskRegistrar) }
      it.fixedDelay().ifPresent { fixedDelay -> registerFixedDelay(it.jobType(), fixedDelay, taskRegistrar) }
    }

  private fun registerCronJob(jobType: String, cron: String, taskRegistrar: ScheduledTaskRegistrar) =
    taskRegistrar.addCronTask({ jobService.startAsyncJob(jobType) }, cron)

  private fun registerFixedDelay(jobType: String, fixedDelay: Duration, taskRegistrar: ScheduledTaskRegistrar) =
    taskRegistrar.addFixedDelayTask(
      IntervalTask({ jobService.startAsyncJob(jobType) }, fixedDelay.toMillis(), fixedDelay.toMillis()))
}
