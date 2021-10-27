package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGCGasComposition;
import com.shell.siep.gto.persistence.repository.raw.GTOGasCompositionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcGcGasCompositionRepository extends GTOGasCompositionRepository<FpcGCGasComposition> {
    public List<FpcGCGasComposition> findAllBySampleIdIn(List<String> sampleId);
}
