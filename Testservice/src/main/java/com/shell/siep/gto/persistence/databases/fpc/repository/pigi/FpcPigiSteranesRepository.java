package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiSteranes;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiSteranesRepository extends GTOAnalysisRepository<FpcPigiSteranes> {
    public List<FpcPigiSteranes> findAllBySampleIdIn(List<String> sampleId);
}
