package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOChnosRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcChnos;
import java.util.List;

@Repository
public interface FpcChnosRepository extends GTOChnosRepository<FpcChnos> {
	public List<FpcChnos> findAllBySampleIdIn(List<String> sampleId);
}