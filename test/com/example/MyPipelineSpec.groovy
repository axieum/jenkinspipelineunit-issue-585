package com.example

import com.lesfurets.jenkins.unit.declarative.DeclarativePipelineTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static com.lesfurets.jenkins.unit.global.lib.LibraryConfiguration.library
import static com.lesfurets.jenkins.unit.global.lib.ProjectSource.projectSource

class MyPipelineSpec extends DeclarativePipelineTest {

    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
        helper.registerSharedLibrary(
            library()
                .name('jenkinspipelineunit-issue-585')
                .defaultVersion('main')
                .retriever(projectSource())
                .allowOverride(true)
                .implicit(true)
                .targetPath('<notNeeded>')
                .build()
        )
    }

    @Test
    void "should execute without errors"() {
        runScript('test/resources/MyPipeline.jenkins')
        printCallStack()
        assertJobStatusSuccess()
    }

}
