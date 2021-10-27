package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilCnt;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCntRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDOilCntRepository extends GTOOilCntRepository<DDOilCnt> {
    public List<DDOilCnt> findAllBySampleIdIn(List<String> sampleId);
}
