package br.com.mastertech.couto.userservice.client

import br.com.mastertech.couto.userservice.client.model.Address
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "CEP")
interface CepClient {
    @GetMapping("/cep/{cep}")
    fun getAddress(@PathVariable(name = "cep") cep: String): Address
}