package br.com.mastertech.couto.userservice.client.model

data class Address(
        val cep: String,
        val logradouro: String,
        val bairro: String,
        val localidade: String,
        val uf: String
)