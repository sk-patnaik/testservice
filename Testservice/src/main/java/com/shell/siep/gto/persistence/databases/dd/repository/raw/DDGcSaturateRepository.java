package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDGcSaturateRepository extends GTOGcSaturateRepository<DDGcSaturate> {
    public List<DDGcSaturate> findAllBySampleIdIn(List<String> sampleId);
}
