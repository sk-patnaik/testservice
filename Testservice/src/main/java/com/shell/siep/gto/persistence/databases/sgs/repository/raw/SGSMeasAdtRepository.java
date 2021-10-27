package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOMeasAdtRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasAdt;
import java.util.List;

@Repository
public interface SGSMeasAdtRepository extends GTOMeasAdtRepository<SGSMeasAdt> {
	public List<SGSMeasAdt> findAllBySampleIdIn(List<String> sampleId);
}
