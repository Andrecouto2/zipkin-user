package br.com.mastertech.couto.userservice.controller

import br.com.mastertech.couto.userservice.model.UserMapper
import br.com.mastertech.couto.userservice.model.dto.GetUserRequest
import br.com.mastertech.couto.userservice.model.dto.GetUserResponse
import br.com.mastertech.couto.userservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @Autowired
    private lateinit var userMapper: UserMapper

    @PostMapping
    fun cadastrarUsuario(@RequestBody getUserRequest: GetUserRequest): ResponseEntity<GetUserResponse> {
        return ResponseEntity.ok(userMapper.toGetUserResponse(userService.registerUser(getUserRequest.nome, getUserRequest.cep)))
    }
}