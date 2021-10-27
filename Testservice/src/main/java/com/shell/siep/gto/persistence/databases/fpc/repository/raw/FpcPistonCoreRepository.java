package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOPistonCoreRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcPistonCore;
import java.util.List;

@Repository
public interface FpcPistonCoreRepository extends GTOPistonCoreRepository<FpcPistonCore> {
	public List<FpcPistonCore> findAllBySampleIdIn(List<String> sampleId);
}