package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDChromdataBlob;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDChromdataBlobRepository extends GTOGcGasolineRepository<DDChromdataBlob> {
    public List<DDChromdataBlob> findAllBySampleIdIn(List<String> sampleId);
}
