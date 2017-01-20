package com.hendisantika.kotlin.repository

import com.hendisantika.kotlin.domain.User
import org.springframework.data.repository.CrudRepository

/**
 * Created by hendisantika on 19/01/17.
 */
interface UserRepository: CrudRepository<User, Long> {
    fun findByName(name: String): List<User>
}