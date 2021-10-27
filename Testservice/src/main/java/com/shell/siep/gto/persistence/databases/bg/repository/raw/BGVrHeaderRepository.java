package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGVrHeader;
import com.shell.siep.gto.persistence.repository.raw.GTOVrHeaderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGVrHeaderRepository extends GTOVrHeaderRepository<BGVrHeader> {
    public List<BGVrHeader> findAllBySampleIdIn(List<String> sampleId);
}
