package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasCloudpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCloudpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilCloudpointRepository extends GTOOilCloudpointRepository<SGSMeasCloudpoint> {
    public List<SGSMeasCloudpoint> findAllBySampleIdIn(List<String> sampleId);
}
