package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcGc;
import com.shell.siep.gto.persistence.repository.raw.GTOGCGCRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGCGCRepository extends GTOGCGCRepository<FpcGcGc> {
    public List<FpcGcGc> findAllBySampleIdIn(List<String> sampleId);
}
