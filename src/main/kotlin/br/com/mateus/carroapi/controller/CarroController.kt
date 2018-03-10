package br.com.mateus.carroapi.controller

import br.com.mateus.carroapi.entity.Carro
import br.com.mateus.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/carro")

class CarroController(){

    @Autowired
    lateinit var  carroService: CarroService

    @GetMapping()
    fun buscarTodos() : List<Carro>{
        return carroService.buscarTodosOsCarros()
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }

}