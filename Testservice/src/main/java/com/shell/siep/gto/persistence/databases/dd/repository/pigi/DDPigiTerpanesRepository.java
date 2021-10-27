package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiTerpanes;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiTerpanesRepository extends GTOAnalysisRepository<DDPigiTerpanes> {
    public List<DDPigiTerpanes> findAllBySampleIdIn(List<String> sampleId);
}
