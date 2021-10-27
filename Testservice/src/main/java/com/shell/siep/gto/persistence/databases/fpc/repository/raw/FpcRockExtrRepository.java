package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTORockExtrRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockExtr;
import java.util.List;

@Repository
public interface FpcRockExtrRepository extends GTORockExtrRepository<FpcRockExtr> {
	public List<FpcRockExtr> findAllBySampleIdIn(List<String> sampleId);
}