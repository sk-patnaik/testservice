package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilSulf;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSulfRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcOilSulfRepository extends GTOOilSulfRepository<FpcOilSulf> {
    public List<FpcOilSulf> findAllBySampleIdIn(List<String> sampleId);
}
