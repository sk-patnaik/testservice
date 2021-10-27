package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilNitrogenRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasNitrogen;
import java.util.List;

@Repository
public interface SGSOilNitrogenRepository extends GTOOilNitrogenRepository<SGSMeasNitrogen> {
	public List<SGSMeasNitrogen> findAllBySampleIdIn(List<String> sampleId);
}
