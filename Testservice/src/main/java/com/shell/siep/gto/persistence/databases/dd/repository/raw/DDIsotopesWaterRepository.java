package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDIsotopesWater;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesWaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDIsotopesWaterRepository extends GTOIsotopesWaterRepository<DDIsotopesWater> {
	public List<DDIsotopesWater> findAllBySampleIdIn(List<String> sampleId);
}
