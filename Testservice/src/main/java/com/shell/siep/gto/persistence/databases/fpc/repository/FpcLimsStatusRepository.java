package com.shell.siep.gto.persistence.databases.fpc.repository;

import com.shell.siep.gto.persistence.databases.fpc.model.FpcLimsStatus;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcLimsStatusRepository extends GTOFpcLimsStatusRepository<FpcLimsStatus> {
    List<FpcLimsStatus> findAllByMeasSampleId(String sampleId);
}
