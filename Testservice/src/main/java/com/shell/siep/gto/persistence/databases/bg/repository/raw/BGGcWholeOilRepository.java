package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGGcWholeOil;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGGcWholeOilRepository extends GTOGcWholeOilRepository<BGGcWholeOil> {
    public List<BGGcWholeOil> findAllBySampleIdIn(List<String> sampleId);
}
