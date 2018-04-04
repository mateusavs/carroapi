package br.com.mateus.carroapi.service

import br.com.mateus.carroapi.entity.Users
import br.com.mateus.carroapi.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsersService{

    @Autowired
    lateinit var usersRepository: UsersRepository

    fun buscarPorUser(users: String): List<Users>{
        return usersRepository.findByUser(users)
    }

    fun buscarTodosOsUsers() : List<Users>{
        return usersRepository.findAll()
    }
    fun cadastrar(users: Users){
        usersRepository.save(users)
    }
}