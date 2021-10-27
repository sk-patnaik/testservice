package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOGcGcMsRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcGcMs;
import java.util.List;

@Repository
public interface FpcGcGcMsRepository extends GTOGcGcMsRepository<FpcGcGcMs> {
	public List<FpcGcGcMs> findAllBySampleIdIn(List<String> sampleId);
}