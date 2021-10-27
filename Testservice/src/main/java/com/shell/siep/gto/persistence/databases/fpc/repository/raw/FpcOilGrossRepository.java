package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilGrossRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilGross;
import java.util.List;

@Repository
public interface FpcOilGrossRepository extends GTOOilGrossRepository<FpcOilGross> {
	public List<FpcOilGross> findAllBySampleIdIn(List<String> sampleId);
}