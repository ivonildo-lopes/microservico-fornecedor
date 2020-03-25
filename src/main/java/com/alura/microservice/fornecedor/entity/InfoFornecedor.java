package com.alura.microservice.fornecedor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Data
public class InfoFornecedor {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String estado;
    private String endereco;
}
