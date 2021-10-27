package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilCnt;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCntRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcOilCntRepository extends GTOOilCntRepository<FpcOilCnt> {
    public List<FpcOilCnt> findAllBySampleIdIn(List<String> sampleId);
}
