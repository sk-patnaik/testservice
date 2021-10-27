package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOGcXmdgcNaphRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcXmdgcNaph;
import java.util.List;

@Repository
public interface FpcGcXmdgcNaphRepository extends GTOGcXmdgcNaphRepository<FpcGcXmdgcNaph> {
	public List<FpcGcXmdgcNaph> findAllBySampleIdIn(List<String> sampleId);
}