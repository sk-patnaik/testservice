package com.shell.siep.gto.persistence.databases.fpc.repository.pigi;

import com.shell.siep.gto.persistence.databases.fpc.model.pigi.FpcPigiBaseInfo;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcPigiBaseInfoRepository extends GTOAnalysisRepository<FpcPigiBaseInfo> {
    public List<FpcPigiBaseInfo> findAllBySampleIdIn(List<String> sampleId);
}
