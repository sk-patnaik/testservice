package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilWater;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDOilWaterRepository extends GTOOilWaterRepository<DDOilWater> {
    public List<DDOilWater> findAllBySampleIdIn(List<String> sampleId);
}
