package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOGcXmdgcBenzRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcXmdgcBenz;
import java.util.List;

@Repository
public interface FpcGcXmdgcBenzRepository extends GTOGcXmdgcBenzRepository<FpcGcXmdgcBenz> {
	public List<FpcGcXmdgcBenz> findAllBySampleIdIn(List<String> sampleId);
}