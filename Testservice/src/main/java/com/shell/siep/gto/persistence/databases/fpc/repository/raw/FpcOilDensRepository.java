package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilDens;
import com.shell.siep.gto.persistence.repository.raw.GTOOilDensRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcOilDensRepository extends GTOOilDensRepository<FpcOilDens> {
    public List<FpcOilDens> findAllBySampleIdIn(List<String> sampleId);
}
