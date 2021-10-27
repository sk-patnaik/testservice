package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGGcGasComposition;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGGcGasCompositionRepository extends GTOGcGasolineRepository<BGGcGasComposition> {
    public List<BGGcGasComposition> findAllBySampleIdIn(List<String> sampleId);
}
