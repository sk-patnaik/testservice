package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGCGasComposition;
import com.shell.siep.gto.persistence.repository.raw.GTOGasCompositionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGcGasCompositionRepository extends GTOGasCompositionRepository<DDGCGasComposition> {
    public List<DDGCGasComposition> findAllBySampleIdIn(List<String> sampleId);
}
