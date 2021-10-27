package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcMdgc;
import com.shell.siep.gto.persistence.repository.raw.GTOGcMdgcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGcMdgcRepository extends GTOGcMdgcRepository<DDGcMdgc> {
    public List<DDGcMdgc> findAllBySampleIdIn(List<String> sampleId);
}
