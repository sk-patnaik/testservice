package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasViscosity;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilViscRepository extends GTOGcWholeOilRepository<SGSMeasViscosity> {
    public List<SGSMeasViscosity> findAllBySampleIdIn(List<String> sampleId);
}
