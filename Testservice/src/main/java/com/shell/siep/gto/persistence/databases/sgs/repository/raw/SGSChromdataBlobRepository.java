package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSChromdataBlob;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSChromdataBlobRepository extends GTOGcWholeOilRepository<SGSChromdataBlob> {
    public List<SGSChromdataBlob> findAllBySampleIdIn(List<String> sampleId);
}
