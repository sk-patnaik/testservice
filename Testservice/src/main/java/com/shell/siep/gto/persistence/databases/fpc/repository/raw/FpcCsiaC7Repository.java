package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOCsiaC7Repository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcCsiaC7;
import java.util.List;

@Repository
public interface FpcCsiaC7Repository extends GTOCsiaC7Repository<FpcCsiaC7> {
	public List<FpcCsiaC7> findAllBySampleIdIn(List<String> sampleId);
}