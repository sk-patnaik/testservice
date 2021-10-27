package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTORockMaceralsRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockMacerals;
import java.util.List;

@Repository
public interface FpcRockMaceralsRepository extends GTORockMaceralsRepository<FpcRockMacerals> {
	public List<FpcRockMacerals> findAllBySampleIdIn(List<String> sampleId);
}