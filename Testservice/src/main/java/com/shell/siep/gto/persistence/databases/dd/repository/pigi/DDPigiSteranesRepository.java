package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiSteranes;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiSteranesRepository extends GTOAnalysisRepository<DDPigiSteranes> {
    public List<DDPigiSteranes> findAllBySampleIdIn(List<String> sampleId);
}
