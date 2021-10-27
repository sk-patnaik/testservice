package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiExtract;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiExtractRepository extends GTOAnalysisRepository<FpcPigiExtract> {
    public List<FpcPigiExtract> findAllBySampleIdIn(List<String> sampleId);
}
