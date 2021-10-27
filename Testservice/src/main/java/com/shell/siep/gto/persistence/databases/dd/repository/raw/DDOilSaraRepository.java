package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilSara;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSaraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilSaraRepository extends GTOOilSaraRepository<DDOilSara> {
	public List<DDOilSara> findAllBySampleIdIn(List<String> sampleId);
}
