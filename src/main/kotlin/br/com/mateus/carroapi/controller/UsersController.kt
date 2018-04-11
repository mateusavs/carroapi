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

    @GetMapping("/findUser/{user}")
    fun buscarById(@PathVariable ("user") user: String): Users{
        return usersService.buscarPorUser(user)
    }

    @PostMapping
    fun salvarUser(@RequestBody users: Users){
        usersService.salvarUser(users)
    }

}