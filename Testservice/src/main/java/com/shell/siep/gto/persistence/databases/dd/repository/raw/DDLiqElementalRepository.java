package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqElemental;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqElementalRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqElementalRepository extends GTOLiqElementalRepository<DDLiqElemental> {
	public List<DDLiqElemental> findAllBySampleIdIn(List<String> sampleId);
}
