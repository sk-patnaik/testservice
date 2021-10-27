package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOMsMsRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcMsMs;
import java.util.List;

@Repository
public interface FpcMsMsRepository extends GTOMsMsRepository<FpcMsMs> {
	public List<FpcMsMs> findAllBySampleIdIn(List<String> sampleId);
}