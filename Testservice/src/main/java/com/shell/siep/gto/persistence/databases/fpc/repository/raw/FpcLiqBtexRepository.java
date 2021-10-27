package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqBtexRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqBtex;
import java.util.List;

@Repository
public interface FpcLiqBtexRepository extends GTOLiqBtexRepository<FpcLiqBtex> {
	public List<FpcLiqBtex> findAllBySampleIdIn(List<String> sampleId);
}