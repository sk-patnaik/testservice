package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcSimdis;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSimdisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcSimdisRepository extends GTOGcSimdisRepository<FpcSimdis> {
    public List<FpcSimdis> findAllBySampleIdIn(List<String> sampleId);
}
