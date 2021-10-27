package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiHydrocarbons;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiHydrocarbonsRepository extends GTOAnalysisRepository<DDPigiHydrocarbons> {
    public List<DDPigiHydrocarbons> findAllBySampleIdIn(List<String> sampleId);
}
