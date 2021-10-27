package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiPyrolysis;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiPyrolysisRepository extends GTOAnalysisRepository<FpcPigiPyrolysis> {
    public List<FpcPigiPyrolysis> findAllBySampleIdIn(List<String> sampleId);
}
