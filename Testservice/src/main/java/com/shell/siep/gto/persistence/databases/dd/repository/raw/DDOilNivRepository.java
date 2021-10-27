package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilNiv;
import com.shell.siep.gto.persistence.repository.raw.GTOOilNivRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilNivRepository extends GTOOilNivRepository<DDOilNiv> {
    public List<DDOilNiv> findAllBySampleIdIn(List<String> sampleId);
}
