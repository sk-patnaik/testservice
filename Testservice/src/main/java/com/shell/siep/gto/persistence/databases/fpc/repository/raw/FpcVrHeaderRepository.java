package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcVrHeader;
import com.shell.siep.gto.persistence.repository.raw.GTOVrHeaderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FpcVrHeaderRepository extends GTOVrHeaderRepository<FpcVrHeader> {
    public List<FpcVrHeader> findAllBySampleIdIn(List<String> sampleId);
}
