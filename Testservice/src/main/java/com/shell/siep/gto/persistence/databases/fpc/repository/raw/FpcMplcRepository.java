package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcMplc;
import com.shell.siep.gto.persistence.repository.raw.GTOMplcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcMplcRepository extends GTOMplcRepository<FpcMplc> {
    public List<FpcMplc> findAllBySampleIdIn(List<String> sampleId);
}
