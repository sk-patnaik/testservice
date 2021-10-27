package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiMonoAromatic;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiMonoAromaticRepository extends GTOAnalysisRepository<DDPigiMonoAromatic> {
    public List<DDPigiMonoAromatic> findAllBySampleIdIn(List<String> sampleId);
}
