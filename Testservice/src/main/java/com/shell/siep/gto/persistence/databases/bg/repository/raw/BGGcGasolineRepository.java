package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGGcGasoline;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGGcGasolineRepository extends GTOGcGasolineRepository<BGGcGasoline> {
    public List<BGGcGasoline> findAllBySampleIdIn(List<String> sampleId);
}
