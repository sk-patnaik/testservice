package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcHeadspace;
import com.shell.siep.gto.persistence.repository.raw.GTOGcHeadspaceRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcHeadspaceRepository extends GTOGcHeadspaceRepository<FpcGcHeadspace> {
    public List<FpcGcHeadspace> findAllBySampleIdIn(List<String> sampleId);
}
