package com.shell.siep.gto.persistence.databases.dd.repository;

import com.shell.siep.gto.persistence.databases.dd.model.DDLimsStatus;
import com.shell.siep.gto.persistence.repository.GTOFpcLimsStatusRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLimsStatusRepository extends GTOFpcLimsStatusRepository<DDLimsStatus> {
    List<DDLimsStatus> findAllByMeasSampleId(String sampleId);
}
