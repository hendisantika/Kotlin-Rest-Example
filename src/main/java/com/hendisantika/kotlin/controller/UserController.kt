package com.hendisantika.kotlin.controller

import com.hendisantika.kotlin.domain.User
import com.hendisantika.kotlin.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by hendisantika on 19/01/17.
 */

@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(val userRepository: UserRepository){
    @RequestMapping("/all")
    fun getAll() = userRepository.findAll()

    @RequestMapping("/find")
    fun getByName(@RequestParam name: String) = userRepository.findByName(name)

    @RequestMapping(value = "/add", method = arrayOf(RequestMethod.POST))
    fun addUser(@RequestBody user: User) = userRepository.save(user)
}