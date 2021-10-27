package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilBaseRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilBase;
import java.util.List;

@Repository
public interface FpcOilBaseRepository extends GTOOilBaseRepository<FpcOilBase> {
	public List<FpcOilBase> findAllBySampleIdIn(List<String> sampleId);
}