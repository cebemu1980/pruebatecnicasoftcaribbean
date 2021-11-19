package com.semillero.recursosHumanos.dao;

import com.semillero.recursosHumanos.dto.JobsDTO;

import java.util.List;

public interface JobDao {
    List<JobsDTO> getAllJob();
}
