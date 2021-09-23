package com.example.aula

import lombok.Builder

@Builder
data class UsuarioResponse(
        val id: Long? = null,
        val nome: String,
        val idade: Int
)