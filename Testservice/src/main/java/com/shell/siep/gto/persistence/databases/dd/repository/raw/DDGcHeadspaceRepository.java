package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcHeadspace;
import com.shell.siep.gto.persistence.repository.raw.GTOGcHeadspaceRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcHeadspaceRepository extends GTOGcHeadspaceRepository<DDGcHeadspace> {
    public List<DDGcHeadspace> findAllBySampleIdIn(List<String> sampleId);
}
