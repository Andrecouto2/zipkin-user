package br.com.mastertech.couto.userservice.model

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
data class User (
    val nome: String,
    val cep: String,
    val logradouro: String,
    val bairro: String,
    val localidade: String,
    val uf: String
)