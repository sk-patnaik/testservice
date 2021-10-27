package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiGCIrms;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiGCIrmsRepository extends GTOAnalysisRepository<FpcPigiGCIrms> {
    public List<FpcPigiGCIrms> findAllBySampleIdIn(List<String> sampleId);
}
