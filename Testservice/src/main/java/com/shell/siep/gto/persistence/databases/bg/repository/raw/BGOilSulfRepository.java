package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilSulf;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSulfRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGOilSulfRepository extends GTOOilSulfRepository<BGOilSulf> {
    public List<BGOilSulf> findAllBySampleIdIn(List<String> sampleId);
}
