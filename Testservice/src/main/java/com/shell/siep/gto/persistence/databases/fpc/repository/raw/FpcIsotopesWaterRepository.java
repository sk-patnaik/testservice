package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesWaterRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesWater;
import java.util.List;

@Repository
public interface FpcIsotopesWaterRepository extends GTOIsotopesWaterRepository<FpcIsotopesWater> {
	public List<FpcIsotopesWater> findAllBySampleIdIn(List<String> sampleId);
}