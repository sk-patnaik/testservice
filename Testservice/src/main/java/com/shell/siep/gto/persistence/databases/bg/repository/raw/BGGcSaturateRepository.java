package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGGcSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOGcSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BGGcSaturateRepository extends GTOGcSaturateRepository<BGGcSaturate> {
    public List<BGGcSaturate> findAllBySampleIdIn(List<String> sampleId);
}
