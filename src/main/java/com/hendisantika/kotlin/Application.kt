package com.hendisantika.kotlin

import com.hendisantika.kotlin.domain.User
import com.hendisantika.kotlin.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Created by hendisantika on 19/01/17.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
open class Application {
    @Bean
    open fun generateUsers(userRepository: UserRepository) = CommandLineRunner {
        userRepository.save(User("Hendi Santika", 22))
        userRepository.save(User("Uzumaki Naruto", 24))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}