package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesOil;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcIsotopesOilRepository extends GTOIsotopesOilRepository<FpcIsotopesOil> {
    public List<FpcIsotopesOil> findAllBySampleIdIn(List<String> sampleId);
}
