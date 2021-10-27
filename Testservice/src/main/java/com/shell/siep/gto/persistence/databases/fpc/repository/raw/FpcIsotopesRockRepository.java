package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesRock;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesRockRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcIsotopesRockRepository extends GTOIsotopesRockRepository<FpcIsotopesRock> {
    public List<FpcIsotopesRock> findAllBySampleIdIn(List<String> sampleId);
}


