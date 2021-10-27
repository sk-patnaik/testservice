package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilNitrogen;
import com.shell.siep.gto.persistence.repository.raw.GTOOilNitrogenRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilNitrogenRepository extends GTOOilNitrogenRepository<DDOilNitrogen> {
	public List<DDOilNitrogen> findAllBySampleIdIn(List<String> sampleId);
}
