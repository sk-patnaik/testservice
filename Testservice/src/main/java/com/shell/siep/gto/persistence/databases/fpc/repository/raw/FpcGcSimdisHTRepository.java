package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcSimdisHt;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSimdisHTRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcSimdisHTRepository extends GTOGcSimdisHTRepository<FpcSimdisHt> {
    public List<FpcSimdisHt> findAllBySampleIdIn(List<String> sampleId);
}
