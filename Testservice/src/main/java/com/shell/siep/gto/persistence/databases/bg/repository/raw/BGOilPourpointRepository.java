package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGOilPourpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilPourpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGOilPourpointRepository extends GTOOilPourpointRepository<BGOilPourpoint> {
    public List<BGOilPourpoint> findAllBySampleIdIn(List<String> sampleId);
}
