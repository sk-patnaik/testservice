package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiMiscBiomarkers;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiMiscBiomarkersRepository extends GTOAnalysisRepository<FpcPigiMiscBiomarkers> {
    public List<FpcPigiMiscBiomarkers> findAllBySampleIdIn(List<String> sampleId);
}
