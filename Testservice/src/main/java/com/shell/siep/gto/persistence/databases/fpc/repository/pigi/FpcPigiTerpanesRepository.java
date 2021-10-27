package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiTerpanes;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiTerpanesRepository extends GTOAnalysisRepository<FpcPigiTerpanes> {
    public List<FpcPigiTerpanes> findAllBySampleIdIn(List<String> sampleId);
}
