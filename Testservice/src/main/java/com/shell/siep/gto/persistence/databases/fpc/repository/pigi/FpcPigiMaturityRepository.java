package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiMaturity;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiMaturityRepository extends GTOAnalysisRepository<FpcPigiMaturity> {
    public List<FpcPigiMaturity> findAllBySampleIdIn(List<String> sampleId);
}
