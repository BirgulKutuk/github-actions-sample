package com.brgl.githubactionssample

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GithubActionsSampleApplicationTests {

    @Test
    fun sampleTest() {
        print("sample test 1")
        Assertions.assertTrue(true)
    }
}
