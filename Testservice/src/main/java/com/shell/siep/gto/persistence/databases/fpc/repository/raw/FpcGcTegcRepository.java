package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcTegc;
import com.shell.siep.gto.persistence.repository.raw.GTOGcTegcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcTegcRepository extends GTOGcTegcRepository<FpcGcTegc> {
    public List<FpcGcTegc> findAllBySampleIdIn(List<String> sampleId);
}
