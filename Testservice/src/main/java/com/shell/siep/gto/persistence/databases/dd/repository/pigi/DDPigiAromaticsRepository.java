package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiAromatics;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiAromaticsRepository extends GTOAnalysisRepository<DDPigiAromatics> {
    public List<DDPigiAromatics> findAllBySampleIdIn(List<String> sampleId);
}
