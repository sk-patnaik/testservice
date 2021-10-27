package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcWholeOil;
import com.shell.siep.gto.persistence.repository.raw.GTOGcWholeOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcWholeOilRepository extends GTOGcWholeOilRepository<DDGcWholeOil> {
    public List<DDGcWholeOil> findAllBySampleIdIn(List<String> sampleId);
}
