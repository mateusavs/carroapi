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
    @GetMapping("/find/{placa}")
    fun buscarById(@PathVariable ("placa") placa: String): Carro{
        return carroService.buscarCarroPorPlaca(placa)
    }
    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }

    @DeleteMapping(value = "/delete/{placa}")
    fun deletar(@PathVariable ("placa") placa: String){
        carroService.deletar(placa)
    }
}