package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqPh;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqPhRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqPhRepository extends GTOLiqPhRepository<DDLiqPh> {
	public List<DDLiqPh> findAllBySampleIdIn(List<String> sampleId);
}
