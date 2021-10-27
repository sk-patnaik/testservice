package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilVisc;
import com.shell.siep.gto.persistence.repository.raw.GTOOilViscRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilViscRepository extends GTOOilViscRepository<DDOilVisc> {
    public List<DDOilVisc> findAllBySampleIdIn(List<String> sampleId);
}
