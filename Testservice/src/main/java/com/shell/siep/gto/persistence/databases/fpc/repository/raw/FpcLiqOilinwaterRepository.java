package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqOilinwaterRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqOilinwater;
import java.util.List;

@Repository
public interface FpcLiqOilinwaterRepository extends GTOLiqOilinwaterRepository<FpcLiqOilinwater> {
	public List<FpcLiqOilinwater> findAllBySampleIdIn(List<String> sampleId);
}