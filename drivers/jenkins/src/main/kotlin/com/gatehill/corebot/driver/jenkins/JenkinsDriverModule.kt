package com.gatehill.corebot.driver.jenkins

import com.gatehill.corebot.asSingleton
import com.gatehill.corebot.driver.jenkins.action.JenkinsActionDriver
import com.gatehill.corebot.driver.jenkins.action.JenkinsActionDriverImpl
import com.gatehill.corebot.driver.jenkins.action.JenkinsTriggerJobService
import com.google.inject.AbstractModule

class JenkinsDriverModule : AbstractModule() {
    override fun configure() {
        bind(JenkinsActionDriver::class.java).to(JenkinsActionDriverImpl::class.java).asSingleton()
        bind(JenkinsTriggerJobService::class.java).asSingleton()
    }
}
