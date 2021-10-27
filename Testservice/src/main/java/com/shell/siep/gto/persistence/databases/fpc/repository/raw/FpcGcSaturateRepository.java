package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcGcSaturateRepository extends GTOGcSaturateRepository<FpcGcSaturate> {
    public List<FpcGcSaturate> findAllBySampleIdIn(List<String> sampleId);
}
