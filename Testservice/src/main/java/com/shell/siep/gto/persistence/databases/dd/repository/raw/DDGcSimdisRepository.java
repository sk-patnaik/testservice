package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDSimdis;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSimdisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcSimdisRepository extends GTOGcSimdisRepository<DDSimdis> {
    public List<DDSimdis> findAllBySampleIdIn(List<String> sampleId);
}
