package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqOrganicacids;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqOrganicacidsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqOrganicacidsRepository extends GTOLiqOrganicacidsRepository<DDLiqOrganicacids> {
	public List<DDLiqOrganicacids> findAllBySampleIdIn(List<String> sampleId);
}
