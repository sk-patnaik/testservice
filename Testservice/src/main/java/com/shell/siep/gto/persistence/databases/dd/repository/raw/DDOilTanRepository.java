package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilTan;
import com.shell.siep.gto.persistence.repository.raw.GTOOilTanRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilTanRepository extends GTOOilTanRepository<DDOilTan> {
	public List<DDOilTan> findAllBySampleIdIn(List<String> sampleId);
}
