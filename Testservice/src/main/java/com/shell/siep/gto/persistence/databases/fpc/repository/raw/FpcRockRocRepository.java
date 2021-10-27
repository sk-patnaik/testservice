package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTORockRocRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockRoc;
import java.util.List;

@Repository
public interface FpcRockRocRepository extends GTORockRocRepository<FpcRockRoc> {
	public List<FpcRockRoc> findAllBySampleIdIn(List<String> sampleId);
}