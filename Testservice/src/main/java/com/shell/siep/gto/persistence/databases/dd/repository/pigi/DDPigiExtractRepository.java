package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiExtract;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiExtractRepository extends GTOAnalysisRepository<DDPigiExtract> {
    public List<DDPigiExtract> findAllBySampleIdIn(List<String> sampleId);
}
