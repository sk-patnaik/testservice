package com.shell.siep.gto.persistence.repository.raw;

import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;

import java.util.List;

public interface GTOPfidHeaderRepository<T> extends GTOAnalysisRepository<T> {
	public List<T> findAllBySampleIdIn(List<String> sampleId);
}