package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcAromatic;
import com.shell.siep.gto.persistence.repository.raw.GTOGasCompositionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGcAromaticRepository extends GTOGasCompositionRepository<DDGcAromatic> {
    public List<DDGcAromatic> findAllBySampleIdIn(List<String> sampleId);
}
