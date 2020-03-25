package com.alura.microservice.fornecedor.controller;

import com.alura.microservice.fornecedor.entity.InfoFornecedor;
import com.alura.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @Autowired
    private InfoService service;

    @GetMapping(value = "/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado){
        return service.getInfoPorEstado(estado);
    }

    @GetMapping(value = "/")
    public List<InfoFornecedor> getAllInfo(){
        return service.getAllInfo();
    }


}
