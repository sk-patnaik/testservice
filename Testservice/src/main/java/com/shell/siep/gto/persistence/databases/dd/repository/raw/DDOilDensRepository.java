package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilDens;
import com.shell.siep.gto.persistence.repository.raw.GTOOilDensRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilDensRepository extends GTOOilDensRepository<DDOilDens> {
    public List<DDOilDens> findAllBySampleIdIn(List<String> sampleId);
}
