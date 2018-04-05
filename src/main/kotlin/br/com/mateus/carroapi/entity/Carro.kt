package br.com.mateus.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Carro(@Id var placa: String,
                 var marca: String,
                 var modelo: String,
                 var ano: Int){

/*    constructor(): this("",
                        "",
                        "",
                        0,
                        "")*/
}