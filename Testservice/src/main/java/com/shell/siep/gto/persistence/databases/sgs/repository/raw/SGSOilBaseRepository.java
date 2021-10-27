package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilBaseRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasBase;
import java.util.List;

@Repository
public interface SGSOilBaseRepository extends GTOOilBaseRepository<SGSMeasBase> {
	public List<SGSMeasBase> findAllBySampleIdIn(List<String> sampleId);
}
