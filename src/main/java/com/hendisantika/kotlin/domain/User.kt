package com.hendisantika.kotlin.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by hendisantika on 19/01/17.
 */

@Entity
class User(var name: String = "",
           var age: Long = 0,
           @Id
           @GeneratedValue(strategy = GenerationType.AUTO)
           var id: Long = 0
)

