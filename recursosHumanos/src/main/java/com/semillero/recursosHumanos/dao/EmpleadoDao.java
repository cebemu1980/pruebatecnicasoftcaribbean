package com.semillero.recursosHumanos.dao;

import com.semillero.recursosHumanos.dto.EmpleadosDTO;

import java.util.List;

public interface EmpleadoDao {
    List<EmpleadosDTO> getAllEmpleados();
}
