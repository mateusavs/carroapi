package br.com.mateus.carroapi.controller

import br.com.mateus.carroapi.entity.Users
import br.com.mateus.carroapi.service.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/users")

class UsersController(){

    @Autowired
    lateinit var  usersService: UsersService

    @GetMapping()
    fun buscarTodosOsUsers() : List<Users>{
        return usersService.buscarTodosOsUsers()
    }

    @PostMapping
    fun cadastrar(@RequestBody users: Users){
        usersService.cadastrar(users)
    }

}