package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasTog;
import com.shell.siep.gto.persistence.repository.raw.GTOMeasTogRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSMeasTogRepository extends GTOMeasTogRepository<SGSMeasTog> {
	public List<SGSMeasTog> findAllBySampleIdIn(List<String> sampleId);
}
