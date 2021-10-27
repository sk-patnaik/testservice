package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTORockMaceralsV2Repository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcRockMaceralsV2;
import java.util.List;

@Repository
public interface FpcRockMaceralsV2Repository extends GTORockMaceralsV2Repository<FpcRockMaceralsV2> {
	public List<FpcRockMaceralsV2> findAllBySampleIdIn(List<String> sampleId);
}