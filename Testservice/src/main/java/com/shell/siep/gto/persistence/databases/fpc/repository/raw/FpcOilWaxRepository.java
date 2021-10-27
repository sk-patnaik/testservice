package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilWax;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaxRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcOilWaxRepository extends GTOOilWaxRepository<FpcOilWax> {
    public List<FpcOilWax> findAllBySampleIdIn(List<String> sampleId);
}
