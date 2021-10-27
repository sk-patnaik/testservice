package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGRockToc;
import com.shell.siep.gto.persistence.repository.raw.GTORockTocRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGRockTocRepository extends GTORockTocRepository<BGRockToc> {
    public List<BGRockToc> findAllBySampleIdIn(List<String> sampleId);
}
