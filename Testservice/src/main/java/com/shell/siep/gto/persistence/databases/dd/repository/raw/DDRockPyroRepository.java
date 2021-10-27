package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockPyro;
import com.shell.siep.gto.persistence.repository.raw.GTORockPyroRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDRockPyroRepository extends GTORockPyroRepository<DDRockPyro> {
    public List<DDRockPyro> findAllBySampleIdIn(List<String> sampleId);
}
