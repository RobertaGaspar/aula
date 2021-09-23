package com.example.aula

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    @GetMapping
    fun retornaUsuario() : List<UsuarioResponse> = listOf(UsuarioResponse(1,"Roberta Gaspar",27), UsuarioResponse(2,"Renata Gaspar",30))
}