package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDVrHeader;
import com.shell.siep.gto.persistence.repository.raw.GTOVrHeaderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDVrHeaderRepository extends GTOVrHeaderRepository<DDVrHeader> {
    public List<DDVrHeader> findAllBySampleIdIn(List<String> sampleId);
}
