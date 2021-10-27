package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilVisc;
import com.shell.siep.gto.persistence.repository.raw.GTOOilViscRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGOilViscRepository extends GTOOilViscRepository<BGOilVisc> {
    public List<BGOilVisc> findAllBySampleIdIn(List<String> sampleId);
}
