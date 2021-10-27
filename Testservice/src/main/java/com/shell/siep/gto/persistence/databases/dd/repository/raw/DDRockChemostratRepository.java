package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDRockChemostrat;
import com.shell.siep.gto.persistence.repository.raw.GTORockChemostratRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDRockChemostratRepository extends GTORockChemostratRepository<DDRockChemostrat> {
	public List<DDRockChemostrat> findAllBySampleIdIn(List<String> sampleId);
}
