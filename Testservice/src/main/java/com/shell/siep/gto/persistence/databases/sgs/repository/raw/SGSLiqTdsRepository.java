package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasTds;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqTdsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSLiqTdsRepository extends GTOLiqTdsRepository<SGSMeasTds> {
	public List<SGSMeasTds> findAllBySampleIdIn(List<String> sampleId);
}
