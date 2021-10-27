package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqPhRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasPh;
import java.util.List;

@Repository
public interface SGSLiqPhRepository extends GTOLiqPhRepository<SGSMeasPh> {
	public List<SGSMeasPh> findAllBySampleIdIn(List<String> sampleId);
}
