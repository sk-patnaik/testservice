package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockMaceralsV2;
import com.shell.siep.gto.persistence.repository.raw.GTORockMaceralsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDRockMaceralsRepository extends GTORockMaceralsRepository<DDRockMaceralsV2> {
	public List<DDRockMaceralsV2> findAllBySampleIdIn(List<String> sampleId);
}
