package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOMeasTensionRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasTension;
import java.util.List;

@Repository
public interface SGSMeasTensionRepository extends GTOMeasTensionRepository<SGSMeasTension> {
	public List<SGSMeasTension> findAllBySampleIdIn(List<String> sampleId);
}
