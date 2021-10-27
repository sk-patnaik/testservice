package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.raw.SGSMeasBtex;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqBtexRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSLiqBtexRepository extends GTOLiqBtexRepository<SGSMeasBtex> {
	public List<SGSMeasBtex> findAllBySampleIdIn(List<String> sampleId);
}
