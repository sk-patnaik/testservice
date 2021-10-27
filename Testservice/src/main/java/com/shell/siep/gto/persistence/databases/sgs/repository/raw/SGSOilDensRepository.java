package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasDensity;
import com.shell.siep.gto.persistence.repository.raw.GTOOilDensRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilDensRepository extends GTOOilDensRepository<SGSMeasDensity> {
    public List<SGSMeasDensity> findAllBySampleIdIn(List<String> sampleId);
}
