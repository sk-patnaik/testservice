package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasSara;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSaraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilSaraRepository extends GTOOilSaraRepository<SGSMeasSara> {
	public List<SGSMeasSara> findAllBySampleIdIn(List<String> sampleId);
}
