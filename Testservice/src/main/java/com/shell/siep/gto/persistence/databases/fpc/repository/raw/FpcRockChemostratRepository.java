package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTORockChemostratRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockChemostrat;
import java.util.List;

@Repository
public interface FpcRockChemostratRepository extends GTORockChemostratRepository<FpcRockChemostrat> {
	public List<FpcRockChemostrat> findAllBySampleIdIn(List<String> sampleId);
}