package br.com.mateus.carroapi.repository

import br.com.mateus.carroapi.entity.Users
import org.springframework.stereotype.Repository
import org.springframework.data.mongodb.repository.MongoRepository

@Repository
interface UsersRepository : MongoRepository<Users, String>{

    fun findByUser(users: String): List<Users>

}