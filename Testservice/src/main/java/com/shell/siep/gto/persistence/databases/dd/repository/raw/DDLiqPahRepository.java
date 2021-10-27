package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqPah;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqPahRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqPahRepository extends GTOLiqPahRepository<DDLiqPah> {
	public List<DDLiqPah> findAllBySampleIdIn(List<String> sampleId);
}
