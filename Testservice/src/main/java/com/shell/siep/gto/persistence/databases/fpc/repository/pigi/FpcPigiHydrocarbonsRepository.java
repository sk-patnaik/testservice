package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiHydrocarbons;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiHydrocarbonsRepository extends GTOAnalysisRepository<FpcPigiHydrocarbons> {
    public List<FpcPigiHydrocarbons> findAllBySampleIdIn(List<String> sampleId);
}
