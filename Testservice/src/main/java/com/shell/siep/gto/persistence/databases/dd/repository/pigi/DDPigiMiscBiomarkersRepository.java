package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiMiscBiomarkers;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiMiscBiomarkersRepository extends GTOAnalysisRepository<DDPigiMiscBiomarkers> {
    public List<DDPigiMiscBiomarkers> findAllBySampleIdIn(List<String> sampleId);
}
