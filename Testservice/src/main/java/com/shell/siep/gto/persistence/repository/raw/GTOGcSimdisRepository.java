package com.shell.siep.gto.persistence.repository.raw;

import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;

import java.util.List;

public interface GTOGcSimdisRepository<T> extends GTOAnalysisRepository<T> {
    public List<T> findAllBySampleIdIn(List<String> sampleId);
}
