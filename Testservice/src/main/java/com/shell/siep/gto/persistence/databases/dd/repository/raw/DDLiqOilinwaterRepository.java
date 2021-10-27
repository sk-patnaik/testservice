package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqOilinwater;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqOilinwaterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqOilinwaterRepository extends GTOLiqOilinwaterRepository<DDLiqOilinwater> {
	public List<DDLiqOilinwater> findAllBySampleIdIn(List<String> sampleId);
}
