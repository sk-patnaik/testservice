package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasWaxcontent;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaxRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilWaxRepository extends GTOOilWaxRepository<SGSMeasWaxcontent> {
	public List<SGSMeasWaxcontent> findAllBySampleIdIn(List<String> sampleId);
}
