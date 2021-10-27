package com.shell.siep.gto.persistence.databases.bg.repository;

import com.shell.siep.gto.persistence.databases.bg.model.BGLimsStatus;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGLimsStatusRepository extends GTOFpcLimsStatusRepository<BGLimsStatus> {
    List<BGLimsStatus> findAllByMeasSampleId(String sampleId);
}
