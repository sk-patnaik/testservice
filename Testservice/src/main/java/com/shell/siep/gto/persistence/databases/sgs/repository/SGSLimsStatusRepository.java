package com.shell.siep.gto.persistence.databases.sgs.repository;

import com.shell.siep.gto.persistence.databases.sgs.model.SGSLimsStatus;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSLimsStatusRepository extends GTOFpcLimsStatusRepository<SGSLimsStatus> {
    List<SGSLimsStatus> findAllByMeasSampleId(String sampleId);
}
