package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasGcHtgc;
import com.shell.siep.gto.persistence.repository.raw.GTOGCHtgcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSGCHtgcRepository extends GTOGCHtgcRepository<SGSMeasGcHtgc> {
    public List<SGSMeasGcHtgc> findAllBySampleIdIn(List<String> sampleId);
}
