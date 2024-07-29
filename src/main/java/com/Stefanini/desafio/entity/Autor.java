package com.Stefanini.desafio.entity;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "db_autor")
public class Autor {
    
    @NotBlank(message = "O campo nome esta vazio")
    private String nome;

    @Column(name = "genero")
    @NotNull(message = "O campo genero esta vazio")
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "nascimento")
    @NotNull(message = "data de nascimento em branco")
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "UTC")
    private LocalDateTime nascimento;

    @Column(name = "pais")
    @NotBlank(message = "O campo país esta em branco")
    @Enumerated(EnumType.STRING)
    private Pais pais;

    @Column(name = "cpf")
    @CPF
    private String cpf;

    


}