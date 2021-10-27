package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSGcWholeOil;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSGcWholeOilRepository extends GTOGcWholeOilRepository<SGSGcWholeOil> {
    public List<SGSGcWholeOil> findAllBySampleIdIn(List<String> sampleId);
}
