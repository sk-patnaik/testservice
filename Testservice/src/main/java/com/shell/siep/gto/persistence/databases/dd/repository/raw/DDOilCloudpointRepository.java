package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilCloudpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCloudpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilCloudpointRepository extends GTOOilCloudpointRepository<DDOilCloudpoint> {
    public List<DDOilCloudpoint> findAllBySampleIdIn(List<String> sampleId);
}
