package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqDens;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqDensRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqDensRepository extends GTOLiqDensRepository<DDLiqDens> {
	public List<DDLiqDens> findAllBySampleIdIn(List<String> sampleId);
}
