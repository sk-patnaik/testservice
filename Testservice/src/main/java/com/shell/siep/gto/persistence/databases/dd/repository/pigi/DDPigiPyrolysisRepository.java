package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiPyrolysis;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiPyrolysisRepository extends GTOAnalysisRepository<DDPigiPyrolysis> {
    public List<DDPigiPyrolysis> findAllBySampleIdIn(List<String> sampleId);
}
