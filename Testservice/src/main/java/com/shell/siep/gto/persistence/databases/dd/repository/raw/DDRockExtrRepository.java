package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockExtr;
import com.shell.siep.gto.persistence.repository.raw.GTORockExtrRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDRockExtrRepository extends GTORockExtrRepository<DDRockExtr> {
	public List<DDRockExtr> findAllBySampleIdIn(List<String> sampleId);
}
