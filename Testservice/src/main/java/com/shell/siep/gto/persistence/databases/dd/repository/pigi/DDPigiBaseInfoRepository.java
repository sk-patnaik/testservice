package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiBaseInfo;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiBaseInfoRepository extends GTOAnalysisRepository<DDPigiBaseInfo> {
    public List<DDPigiBaseInfo> findAllBySampleIdIn(List<String> sampleId);
}
