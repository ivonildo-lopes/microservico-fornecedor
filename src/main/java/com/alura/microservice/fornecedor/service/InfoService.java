package com.alura.microservice.fornecedor.service;

import com.alura.microservice.fornecedor.entity.InfoFornecedor;

import java.util.List;

public interface InfoService {

    InfoFornecedor getInfoPorEstado(String estado);
    List<InfoFornecedor> getAllInfo();
}
