package br.com.mastertech.couto.userservice.service

import br.com.mastertech.couto.userservice.client.CepClient
import br.com.mastertech.couto.userservice.client.model.Address
import br.com.mastertech.couto.userservice.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var cepClient: CepClient

    fun registerUser(nome: String, cep: String): User {
        val address: Address = cepClient.getAddress(cep)
        return User(nome, address.cep, address.logradouro, address.bairro, address.localidade, address.uf)
    }
}