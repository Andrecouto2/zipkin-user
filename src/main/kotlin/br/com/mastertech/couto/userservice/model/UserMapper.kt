package br.com.mastertech.couto.userservice.model

import br.com.mastertech.couto.userservice.model.dto.GetUserRequest
import br.com.mastertech.couto.userservice.model.dto.GetUserResponse
import org.springframework.stereotype.Component

@Component
class UserMapper {

    fun toGetUserRequest(user: User): GetUserRequest {
        return GetUserRequest(user.nome, user.cep)
    }

    fun toGetUserResponse(user: User): GetUserResponse {
        return GetUserResponse(user.nome, user.cep, user.logradouro, user.bairro, user.localidade, user.uf)
    }
}