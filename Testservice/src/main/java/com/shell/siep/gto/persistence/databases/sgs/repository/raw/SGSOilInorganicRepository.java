package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasInorganic;
import com.shell.siep.gto.persistence.repository.raw.GTOOilInorganicRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSOilInorganicRepository extends GTOOilInorganicRepository<SGSMeasInorganic> {
	public List<SGSMeasInorganic> findAllBySampleIdIn(List<String> sampleId);
}
