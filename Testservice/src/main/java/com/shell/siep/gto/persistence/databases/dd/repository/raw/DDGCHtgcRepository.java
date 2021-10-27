package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcHtgc;
import com.shell.siep.gto.persistence.repository.raw.GTOGCHtgcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGCHtgcRepository extends GTOGCHtgcRepository<DDGcHtgc> {
    public List<DDGcHtgc> findAllBySampleIdIn(List<String> sampleId);
}
