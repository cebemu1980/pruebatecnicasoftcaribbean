package com.semillero.recursosHumanos.dao;

import com.semillero.recursosHumanos.dto.JobsDTO;
import com.semillero.recursosHumanos.service.JobsService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JobDaoImplement implements JobDao{
    private JobsService jobsService;//llamamos a la interfaz de jobs en el service

    public JobDaoImplement(JobsService jobsService) {
        this.jobsService = jobsService;
    }

    JdbcTemplate jdbcTemplate;
    public JobDaoImplement(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<JobsDTO> getAllJob() {
        return jobsService.getAllJob();
    }
}
