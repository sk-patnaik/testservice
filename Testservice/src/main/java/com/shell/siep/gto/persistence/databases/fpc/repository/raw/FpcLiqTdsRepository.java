package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqTdsRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqTds;
import java.util.List;

@Repository
public interface FpcLiqTdsRepository extends GTOLiqTdsRepository<FpcLiqTds> {
	public List<FpcLiqTds> findAllBySampleIdIn(List<String> sampleId);
}