package br.com.mateus.carroapi.service

import br.com.mateus.carroapi.entity.Users
import br.com.mateus.carroapi.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsersService{

    @Autowired
    lateinit var usersRepository: UsersRepository

    fun buscarPorUser(user: String): Users{
        return usersRepository.findByUser(user)
    }

    fun buscarTodosOsUsers() : List<Users>{
        return usersRepository.findAll()
    }
    fun salvarUser(users: Users){
        usersRepository.save(users)
    }
}