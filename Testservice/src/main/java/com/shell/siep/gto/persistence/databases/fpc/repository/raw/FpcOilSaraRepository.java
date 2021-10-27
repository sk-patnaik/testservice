package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilSaraRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilSara;
import java.util.List;

@Repository
public interface FpcOilSaraRepository extends GTOOilSaraRepository<FpcOilSara> {
	public List<FpcOilSara> findAllBySampleIdIn(List<String> sampleId);
}