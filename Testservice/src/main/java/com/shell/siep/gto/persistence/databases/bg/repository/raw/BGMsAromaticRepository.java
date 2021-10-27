package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGMsAromatic;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesRockRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGMsAromaticRepository extends GTOIsotopesRockRepository<BGMsAromatic> {
    public List<BGMsAromatic> findAllBySampleIdIn(List<String> sampleId);
}
