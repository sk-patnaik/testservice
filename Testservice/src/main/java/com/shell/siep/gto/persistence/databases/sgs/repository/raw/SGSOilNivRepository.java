package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasNiv;
import com.shell.siep.gto.persistence.repository.raw.GTOOilNivRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilNivRepository extends GTOOilNivRepository<SGSMeasNiv> {
    public List<SGSMeasNiv> findAllBySampleIdIn(List<String> sampleId);
}
