package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiMonoAromatic;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiMonoAromaticRepository extends GTOAnalysisRepository<FpcPigiMonoAromatic> {
    public List<FpcPigiMonoAromatic> findAllBySampleIdIn(List<String> sampleId);
}
