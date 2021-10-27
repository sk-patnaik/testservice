package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilTanRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilTan;
import java.util.List;

@Repository
public interface FpcOilTanRepository extends GTOOilTanRepository<FpcOilTan> {
	public List<FpcOilTan> findAllBySampleIdIn(List<String> sampleId);
}