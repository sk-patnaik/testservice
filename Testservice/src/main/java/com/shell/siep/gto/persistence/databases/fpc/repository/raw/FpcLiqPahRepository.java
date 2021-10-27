package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqPahRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqPah;
import java.util.List;

@Repository
public interface FpcLiqPahRepository extends GTOLiqPahRepository<FpcLiqPah> {
	public List<FpcLiqPah> findAllBySampleIdIn(List<String> sampleId);
}