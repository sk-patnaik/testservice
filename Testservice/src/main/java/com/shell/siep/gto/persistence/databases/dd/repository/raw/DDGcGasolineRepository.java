package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcGasoline;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGasolineRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGcGasolineRepository extends GTOGcGasolineRepository<DDGcGasoline> {
    public List<DDGcGasoline> findAllBySampleIdIn(List<String> sampleId);
}
