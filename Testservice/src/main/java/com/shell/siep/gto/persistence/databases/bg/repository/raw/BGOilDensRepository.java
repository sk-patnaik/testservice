package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilDens;
import com.shell.siep.gto.persistence.repository.raw.GTOOilDensRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGOilDensRepository extends GTOOilDensRepository<BGOilDens> {
    public List<BGOilDens> findAllBySampleIdIn(List<String> sampleId);
}
