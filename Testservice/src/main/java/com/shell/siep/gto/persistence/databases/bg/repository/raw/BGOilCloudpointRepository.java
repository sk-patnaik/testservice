package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilCloudpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCloudpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGOilCloudpointRepository extends GTOOilCloudpointRepository<BGOilCloudpoint> {
    public List<BGOilCloudpoint> findAllBySampleIdIn(List<String> sampleId);
}
