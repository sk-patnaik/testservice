package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiGasolines;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiGasolinesRepository extends GTOAnalysisRepository<DDPigiGasolines> {
    public List<DDPigiGasolines> findAllBySampleIdIn(List<String> sampleId);
}
