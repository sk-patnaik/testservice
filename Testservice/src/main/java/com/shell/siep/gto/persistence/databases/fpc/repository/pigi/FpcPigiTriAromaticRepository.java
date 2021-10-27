package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiTriAromatic;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiTriAromaticRepository extends GTOAnalysisRepository<FpcPigiTriAromatic> {
    public List<FpcPigiTriAromatic> findAllBySampleIdIn(List<String> sampleId);
}
