package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilPourpoint;
import com.shell.siep.gto.persistence.repository.raw.GTOOilPourpointRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDOilPourpointRepository extends GTOOilPourpointRepository<DDOilPourpoint> {
    public List<DDOilPourpoint> findAllBySampleIdIn(List<String> sampleId);
}
