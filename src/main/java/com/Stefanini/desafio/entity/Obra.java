package com.Stefanini.desafio.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Obra {
    
    @NotBlank(message = "O campo nome tá vazio")
    private String nome;

    @NotBlank(message = "O campo descrição tá vazio")
    @Size(max = 240)
    private String descricao;
    
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDateTime dataPublicacao;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dataExposicao;
}
