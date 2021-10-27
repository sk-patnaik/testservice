package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilGross;
import com.shell.siep.gto.persistence.repository.raw.GTOOilGrossRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilGrossRepository extends GTOOilGrossRepository<DDOilGross> {
	public List<DDOilGross> findAllBySampleIdIn(List<String> sampleId);
}
