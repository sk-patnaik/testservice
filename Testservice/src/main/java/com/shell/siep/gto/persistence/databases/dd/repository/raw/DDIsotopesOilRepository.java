package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDIsotopesOil;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDIsotopesOilRepository extends GTOIsotopesOilRepository<DDIsotopesOil> {
    public List<DDIsotopesOil> findAllBySampleIdIn(List<String> sampleId);
}
