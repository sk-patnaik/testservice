package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockToc;
import com.shell.siep.gto.persistence.repository.raw.GTORockTocRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DDRockTocRepository extends GTORockTocRepository<DDRockToc> {
    public List<DDRockToc> findAllBySampleIdIn(List<String> sampleId);
}

