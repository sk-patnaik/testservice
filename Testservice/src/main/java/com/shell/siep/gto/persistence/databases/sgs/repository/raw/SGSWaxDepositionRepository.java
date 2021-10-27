package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSWaxDeposition;
import com.shell.siep.gto.persistence.repository.raw.GTOWaxDepositionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSWaxDepositionRepository extends GTOWaxDepositionRepository<SGSWaxDeposition> {
	public List<SGSWaxDeposition> findAllBySampleIdIn(List<String> sampleId);
}
