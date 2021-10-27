package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilCloudpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCloudpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcOilCloudpointRepository extends GTOOilCloudpointRepository<FpcOilCloudpoint> {
    public List<FpcOilCloudpoint> findAllBySampleIdIn(List<String> sampleId);
}
