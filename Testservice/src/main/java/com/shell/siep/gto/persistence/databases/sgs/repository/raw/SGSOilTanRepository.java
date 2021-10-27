package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasTan;
import com.shell.siep.gto.persistence.repository.raw.GTOOilTanRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilTanRepository extends GTOOilTanRepository<SGSMeasTan> {
	public List<SGSMeasTan> findAllBySampleIdIn(List<String> sampleId);
}
