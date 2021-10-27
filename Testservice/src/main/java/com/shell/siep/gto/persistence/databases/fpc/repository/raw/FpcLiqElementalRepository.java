package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqElementalRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqElemental;
import java.util.List;

@Repository
public interface FpcLiqElementalRepository extends GTOLiqElementalRepository<FpcLiqElemental> {
	public List<FpcLiqElemental> findAllBySampleIdIn(List<String> sampleId);
}