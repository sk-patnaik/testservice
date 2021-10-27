package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilNitrogenRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilNitrogen;
import java.util.List;

@Repository
public interface FpcOilNitrogenRepository extends GTOOilNitrogenRepository<FpcOilNitrogen> {
	public List<FpcOilNitrogen> findAllBySampleIdIn(List<String> sampleId);
}