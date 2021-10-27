package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqOrganicacidsRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqOrganicacids;
import java.util.List;

@Repository
public interface FpcLiqOrganicacidsRepository extends GTOLiqOrganicacidsRepository<FpcLiqOrganicacids> {
	public List<FpcLiqOrganicacids> findAllBySampleIdIn(List<String> sampleId);
}