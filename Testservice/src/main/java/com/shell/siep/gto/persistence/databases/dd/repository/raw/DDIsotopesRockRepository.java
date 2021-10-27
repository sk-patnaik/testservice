package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDIsotopesRock;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesRockRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDIsotopesRockRepository extends GTOIsotopesRockRepository<DDIsotopesRock> {
    public List<DDIsotopesRock> findAllBySampleIdIn(List<String> sampleId);
}


