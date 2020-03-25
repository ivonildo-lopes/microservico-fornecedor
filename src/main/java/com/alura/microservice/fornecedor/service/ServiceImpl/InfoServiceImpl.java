package com.alura.microservice.fornecedor.service.ServiceImpl;

import com.alura.microservice.fornecedor.dao.InfoDao;
import com.alura.microservice.fornecedor.entity.InfoFornecedor;
import com.alura.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoDao dao;

    @Override
    public InfoFornecedor getInfoPorEstado(String estado) {

        return dao.findByEstado(estado);
    }

    @Override
    public List<InfoFornecedor> getAllInfo() {
        return  dao.findAll();
    }
}
