package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiTriAromatic;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiTriAromaticRepository extends GTOAnalysisRepository<DDPigiTriAromatic> {
    public List<DDPigiTriAromatic> findAllBySampleIdIn(List<String> sampleId);
}
