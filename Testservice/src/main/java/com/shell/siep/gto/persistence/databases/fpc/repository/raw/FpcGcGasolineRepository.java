package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcGasoline;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcGcGasolineRepository extends GTOGcGasolineRepository<FpcGcGasoline> {
    public List<FpcGcGasoline> findAllBySampleIdIn(List<String> sampleId);
}
