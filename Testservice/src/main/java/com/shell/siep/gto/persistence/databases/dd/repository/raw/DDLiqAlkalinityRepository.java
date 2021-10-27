package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqAlkalinity;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqAlkalinityRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqAlkalinityRepository extends GTOLiqAlkalinityRepository<DDLiqAlkalinity> {
	public List<DDLiqAlkalinity> findAllBySampleIdIn(List<String> sampleId);
}
