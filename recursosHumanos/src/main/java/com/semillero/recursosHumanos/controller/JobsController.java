package com.semillero.recursosHumanos.controller;

import com.semillero.recursosHumanos.dao.JobDao;
import com.semillero.recursosHumanos.dto.JobsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//agregamos la ruta por donde se consumira el servicio
@RequestMapping("/api/jobs")
public class JobsController {
    //importamos la dependencia del DAO
    private JobDao jobDao;

    //inyectamos la dependencia por constructor
    public JobsController(JobDao jobDao) {
        this.jobDao = jobDao;
    }
//indicamos por donde va a ser consumido HTTP
    @GetMapping("/")
    List<JobsDTO> get(){
        //llamamos a la dependencia y al metodo
        return jobDao.getAllJob();
    }
}
