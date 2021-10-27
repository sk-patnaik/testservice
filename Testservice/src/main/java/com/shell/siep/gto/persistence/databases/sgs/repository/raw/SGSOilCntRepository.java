package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasCnt;
import com.shell.siep.gto.persistence.repository.raw.GTOOilCntRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilCntRepository extends GTOOilCntRepository<SGSMeasCnt> {
	public List<SGSMeasCnt> findAllBySampleIdIn(List<String> sampleId);
}
