package com.semillero.recursosHumanos.service;

import com.semillero.recursosHumanos.dao.EmpleadoDao;
import com.semillero.recursosHumanos.dto.EmpleadosDTO;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Component
@Transactional
public class EmpleadoServiceImplement implements EmpleadoService{
    private final Logger log = (Logger) LoggerFactory.getLogger(EmpleadoServiceImplement.class);

    @Autowired
    private EmpleadoDao dao;

    @Override
    public List<EmpleadosDTO> getAllEmpleados() {
        dao.getAllEmpleados();
        return null;
    }
}
