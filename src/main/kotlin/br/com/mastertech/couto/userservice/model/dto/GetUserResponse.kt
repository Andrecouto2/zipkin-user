package br.com.mastertech.couto.userservice.model.dto

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
class GetUserResponse(val nome: String? = null,
                      val cep: String? = null,
                      val logradouro: String? = null,
                      val bairro: String? = null,
                      val localidade: String? = null,
                      val uf: String? = null)