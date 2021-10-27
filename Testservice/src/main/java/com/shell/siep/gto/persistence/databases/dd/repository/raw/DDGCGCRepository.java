package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcGc;
import com.shell.siep.gto.persistence.repository.raw.GTOGCGCRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGCGCRepository extends GTOGCGCRepository<DDGcGc> {
    public List<DDGcGc> findAllBySampleIdIn(List<String> sampleId);
}
