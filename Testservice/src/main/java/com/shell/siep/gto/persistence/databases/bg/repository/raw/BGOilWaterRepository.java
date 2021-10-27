package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilWater;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGOilWaterRepository extends GTOOilWaterRepository<BGOilWater> {
    public List<BGOilWater> findAllBySampleIdIn(List<String> sampleId);
}
