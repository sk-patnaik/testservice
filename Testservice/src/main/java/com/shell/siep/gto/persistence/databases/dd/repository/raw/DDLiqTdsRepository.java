package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqTds;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqTdsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqTdsRepository extends GTOLiqTdsRepository<DDLiqTds> {
	public List<DDLiqTds> findAllBySampleIdIn(List<String> sampleId);
}
