package com.hendisantika.kotlin

import org.springframework.stereotype.Service

/**
 * Created by hendisantika on 19/01/17.
 */
@Service
class HelloService(val restaurantRepository: RestaurantRepository) {

    fun hello() = "Hello!"

    fun count() = restaurantRepository.count()

}