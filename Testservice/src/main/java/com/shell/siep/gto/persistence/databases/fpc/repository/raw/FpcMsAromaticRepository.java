package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcMsAromatic;
import com.shell.siep.gto.persistence.repository.raw.GTOMsAromaticRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcMsAromaticRepository extends GTOMsAromaticRepository<FpcMsAromatic> {
    public List<FpcMsAromatic> findAllBySampleIdIn(List<String> sampleId);
}
