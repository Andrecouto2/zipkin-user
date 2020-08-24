package br.com.mastertech.couto.userservice.model.dto

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
class GetUserRequest(val nome: String, val cep: String)