package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockRoc;
import com.shell.siep.gto.persistence.repository.raw.GTORockRocRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDRockRocRepository extends GTORockRocRepository<DDRockRoc> {
	public List<DDRockRoc> findAllBySampleIdIn(List<String> sampleId);
}
