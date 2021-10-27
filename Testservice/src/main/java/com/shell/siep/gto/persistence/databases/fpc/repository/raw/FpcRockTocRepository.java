package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockToc;
import com.shell.siep.gto.persistence.repository.raw.GTORockTocRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FpcRockTocRepository extends GTORockTocRepository<FpcRockToc> {
    public List<FpcRockToc> findAllBySampleIdIn(List<String> sampleId);
}

