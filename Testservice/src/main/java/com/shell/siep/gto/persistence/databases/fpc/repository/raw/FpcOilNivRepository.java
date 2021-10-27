package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilNiv;
import com.shell.siep.gto.persistence.repository.raw.GTOOilNivRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcOilNivRepository extends GTOOilNivRepository<FpcOilNiv> {
    public List<FpcOilNiv> findAllBySampleIdIn(List<String> sampleId);
}
