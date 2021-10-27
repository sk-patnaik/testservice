package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqAlkalinityRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqAlkalinity;
import java.util.List;

@Repository
public interface FpcLiqAlkalinityRepository extends GTOLiqAlkalinityRepository<FpcLiqAlkalinity> {
	public List<FpcLiqAlkalinity> findAllBySampleIdIn(List<String> sampleId);
}