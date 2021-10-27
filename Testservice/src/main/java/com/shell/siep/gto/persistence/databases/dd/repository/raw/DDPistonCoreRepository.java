package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDPistonCore;
import com.shell.siep.gto.persistence.repository.raw.GTOPistonCoreRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPistonCoreRepository extends GTOPistonCoreRepository<DDPistonCore> {
	public List<DDPistonCore> findAllBySampleIdIn(List<String> sampleId);
}
