package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilVisc;
import com.shell.siep.gto.persistence.repository.raw.GTOOilViscRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcOilViscRepository extends GTOOilViscRepository<FpcOilVisc> {
    public List<FpcOilVisc> findAllBySampleIdIn(List<String> sampleId);
}
