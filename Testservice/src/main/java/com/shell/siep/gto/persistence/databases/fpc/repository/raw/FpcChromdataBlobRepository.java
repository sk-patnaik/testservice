package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOChromdataBlobRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcChromdataBlob;
import java.util.List;

@Repository
public interface FpcChromdataBlobRepository extends GTOChromdataBlobRepository<FpcChromdataBlob> {
    public List<FpcChromdataBlob> findAllBySampleIdIn(List<String> sampleId);
}
