package com.semillero.recursosHumanos.dao;

import com.semillero.recursosHumanos.dto.EmpleadosDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmpleadoDaoImplement implements EmpleadoDao{
    JdbcTemplate jdbcTemplate;
    public EmpleadoDaoImplement(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<EmpleadosDTO> getAllEmpleados() {
        String sql = "SELECT first_name FROM employees";
        return jdbcTemplate.query(sql,(rs, rowNum) ->{
            EmpleadosDTO empleadosDTO = new EmpleadosDTO();
            empleadosDTO.setFirst_name(rs.getString("first_name"));
            return empleadosDTO;
        });
    }
}
