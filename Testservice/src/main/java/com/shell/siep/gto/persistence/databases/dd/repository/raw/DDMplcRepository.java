package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDMplc;
import com.shell.siep.gto.persistence.repository.raw.GTOMplcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDMplcRepository extends GTOMplcRepository<DDMplc> {
    public List<DDMplc> findAllBySampleIdIn(List<String> sampleId);
}
