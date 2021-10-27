package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGChromdataBlob;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGChromdataBlobRepository extends GTOGcGasolineRepository<BGChromdataBlob> {
    public List<BGChromdataBlob> findAllBySampleIdIn(List<String> sampleId);
}
