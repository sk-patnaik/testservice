package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasPourpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilPourpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilPourpointRepository extends GTOOilPourpointRepository<SGSMeasPourpoint> {
    public List<SGSMeasPourpoint> findAllBySampleIdIn(List<String> sampleId);
}
