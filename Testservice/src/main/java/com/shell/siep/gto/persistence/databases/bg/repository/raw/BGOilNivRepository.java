package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilNiv;
import com.shell.siep.gto.persistence.repository.raw.GTOOilNivRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGOilNivRepository extends GTOOilNivRepository<BGOilNiv> {
    public List<BGOilNiv> findAllBySampleIdIn(List<String> sampleId);
}
