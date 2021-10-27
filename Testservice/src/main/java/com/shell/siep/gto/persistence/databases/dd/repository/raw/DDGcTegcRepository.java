package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcTegc;
import com.shell.siep.gto.persistence.repository.raw.GTOGcTegcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcTegcRepository extends GTOGcTegcRepository<DDGcTegc> {
    public List<DDGcTegc> findAllBySampleIdIn(List<String> sampleId);
}
