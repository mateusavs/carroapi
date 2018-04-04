package br.com.mateus.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Users(@Id var id: String?,
                 var user: String,
                 var password: String) {
}