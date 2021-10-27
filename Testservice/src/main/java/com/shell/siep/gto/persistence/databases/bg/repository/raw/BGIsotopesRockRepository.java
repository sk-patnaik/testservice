package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGIsotopesRock;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesRockRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGIsotopesRockRepository extends GTOIsotopesRockRepository<BGIsotopesRock> {
    public List<BGIsotopesRock> findAllBySampleIdIn(List<String> sampleId);
}
