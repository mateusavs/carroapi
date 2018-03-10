package br.com.mateus.carroapi.service

import br.com.mateus.carroapi.entity.Carro
import br.com.mateus.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService{

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarCarroPorMarca(marca: String): List<Carro>{
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorAno(ano: Int): List<Carro>{
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorPlaca(placa: String): Carro{
        return carroRepository.findByPlaca(placa)
    }

    fun buscarTodosOsCarros() : List<Carro>{
        return carroRepository.findAll()
    }
    fun salvar(carro: Carro){
        carroRepository.save(carro)
    }

    fun deletar(marca: String){
        carroRepository.deleteByMarca("marca")
    }
}