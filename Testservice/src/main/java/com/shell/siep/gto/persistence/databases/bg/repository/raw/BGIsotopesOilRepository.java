package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGIsotopesRock;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesOilRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGIsotopesOilRepository extends GTOIsotopesOilRepository<BGIsotopesRock> {
    public List<BGIsotopesRock> findAllBySampleIdIn(List<String> sampleId);
}
