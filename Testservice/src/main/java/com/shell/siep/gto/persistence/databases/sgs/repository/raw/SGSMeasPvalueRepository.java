package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOMeasPvalueRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasPvalue;
import java.util.List;

@Repository
public interface SGSMeasPvalueRepository extends GTOMeasPvalueRepository<SGSMeasPvalue> {
	public List<SGSMeasPvalue> findAllBySampleIdIn(List<String> sampleId);
}
