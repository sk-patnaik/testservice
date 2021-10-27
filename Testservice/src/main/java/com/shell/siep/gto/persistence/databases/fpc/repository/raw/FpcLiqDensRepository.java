package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqDensRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqDens;
import java.util.List;

@Repository
public interface FpcLiqDensRepository extends GTOLiqDensRepository<FpcLiqDens> {
	public List<FpcLiqDens> findAllBySampleIdIn(List<String> sampleId);
}