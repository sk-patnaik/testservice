package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiGCIrms;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiGCIrmsRepository extends GTOAnalysisRepository<DDPigiGCIrms> {
    public List<DDPigiGCIrms> findAllBySampleIdIn(List<String> sampleId);
}
