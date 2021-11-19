package com.semillero.recursosHumanos.service;

import com.semillero.recursosHumanos.dao.JobDao;
import com.semillero.recursosHumanos.dto.JobsDTO;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Component
@Transactional
public class JobsServiceImplement implements JobsService{
    private final Logger log = (Logger) LoggerFactory.getLogger(JobsServiceImplement.class);

    @Autowired
    private JobDao dao;

    @Override
    public List<JobsDTO> getAllJob() {
        dao.getAllJob();
        return null;
    }
}
