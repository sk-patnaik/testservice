package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcGcWholeOil;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcGcWholeOilRepository extends GTOGcWholeOilRepository<FpcGcWholeOil> {
    public List<FpcGcWholeOil> findAllBySampleIdIn(List<String> sampleId);
}
