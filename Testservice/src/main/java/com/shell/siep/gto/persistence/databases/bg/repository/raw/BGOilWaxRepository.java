package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilWax;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaxRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGOilWaxRepository extends GTOOilWaxRepository<BGOilWax> {
    public List<BGOilWax> findAllBySampleIdIn(List<String> sampleId);
}
