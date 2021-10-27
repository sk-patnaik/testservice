package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcAromatic;
import com.shell.siep.gto.persistence.repository.raw.GTOGCAromaticRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGCAromaticRepository extends GTOGCAromaticRepository<FpcGcAromatic> {
    public List<FpcGcAromatic> findAllBySampleIdIn(List<String> sampleId);
}
