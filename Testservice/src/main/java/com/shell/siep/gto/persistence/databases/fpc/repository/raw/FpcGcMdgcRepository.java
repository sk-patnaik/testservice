package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcMdgc;
import com.shell.siep.gto.persistence.repository.raw.GTOGcMdgcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcMdgcRepository extends GTOGcMdgcRepository<FpcGcMdgc> {
    public List<FpcGcMdgc> findAllBySampleIdIn(List<String> sampleId);
}
