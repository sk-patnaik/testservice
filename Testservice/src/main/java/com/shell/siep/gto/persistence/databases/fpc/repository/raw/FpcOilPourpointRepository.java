package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilPourpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilPourpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcOilPourpointRepository extends GTOOilPourpointRepository<FpcOilPourpoint> {
    public List<FpcOilPourpoint> findAllBySampleIdIn(List<String> sampleId);
}
