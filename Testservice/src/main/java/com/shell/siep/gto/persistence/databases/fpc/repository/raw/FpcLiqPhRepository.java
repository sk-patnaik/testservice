package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqPhRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqPh;
import java.util.List;

@Repository
public interface FpcLiqPhRepository extends GTOLiqPhRepository<FpcLiqPh> {
	public List<FpcLiqPh> findAllBySampleIdIn(List<String> sampleId);
}