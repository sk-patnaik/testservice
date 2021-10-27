package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGRockPyro;
import com.shell.siep.gto.persistence.repository.raw.GTORockPyroRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGRockPyroRepository extends GTORockPyroRepository<BGRockPyro> {
    public List<BGRockPyro> findAllBySampleIdIn(List<String> sampleId);
}
