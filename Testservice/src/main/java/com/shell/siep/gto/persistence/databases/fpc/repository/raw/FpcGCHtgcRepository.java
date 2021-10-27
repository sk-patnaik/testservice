package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcHtgc;
import com.shell.siep.gto.persistence.repository.raw.GTOGCHtgcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGCHtgcRepository extends GTOGCHtgcRepository<FpcGcHtgc> {
    public List<FpcGcHtgc> findAllBySampleIdIn(List<String> sampleId);
}
