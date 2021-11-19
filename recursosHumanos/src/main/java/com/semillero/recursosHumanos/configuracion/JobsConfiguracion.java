package com.semillero.recursosHumanos.configuracion;

import com.semillero.recursosHumanos.dao.JobDao;
import com.semillero.recursosHumanos.dao.JobDaoImplement;
import com.semillero.recursosHumanos.service.JobsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobsConfiguracion {
    @Bean
    JobDao jobDao(JobsService jobsService){
        return new JobDaoImplement(jobsService);
    }
}
