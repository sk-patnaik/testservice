package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasSulf;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSulfRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilSulfRepository extends GTOOilSulfRepository<SGSMeasSulf> {
    public List<SGSMeasSulf> findAllBySampleIdIn(List<String> sampleId);
}
