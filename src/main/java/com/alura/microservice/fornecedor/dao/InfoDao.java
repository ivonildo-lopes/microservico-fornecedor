package com.alura.microservice.fornecedor.dao;

import com.alura.microservice.fornecedor.entity.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoDao extends JpaRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);


}
