package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockPyro;
import com.shell.siep.gto.persistence.repository.raw.GTORockPyroRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcRockPyroRepository extends GTORockPyroRepository<FpcRockPyro> {
    public List<FpcRockPyro> findAllBySampleIdIn(List<String> sampleId);
}
