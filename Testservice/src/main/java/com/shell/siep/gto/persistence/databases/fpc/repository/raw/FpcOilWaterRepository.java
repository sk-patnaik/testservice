package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilWater;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcOilWaterRepository extends GTOOilWaterRepository<FpcOilWater> {
    public List<FpcOilWater> findAllBySampleIdIn(List<String> sampleId);
}
