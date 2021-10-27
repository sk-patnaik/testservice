package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasWatercontent;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilWaterRepository extends GTOOilWaterRepository<SGSMeasWatercontent> {
	public List<SGSMeasWatercontent> findAllBySampleIdIn(List<String> sampleId);
}
