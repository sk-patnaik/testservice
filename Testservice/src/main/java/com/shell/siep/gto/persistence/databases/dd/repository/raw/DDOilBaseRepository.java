package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilBase;
import com.shell.siep.gto.persistence.repository.raw.GTOOilBaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilBaseRepository extends GTOOilBaseRepository<DDOilBase> {
	public List<DDOilBase> findAllBySampleIdIn(List<String> sampleId);
}
