package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilSulf;
import com.shell.siep.gto.persistence.repository.raw.GTOOilSulfRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDOilSulfRepository extends GTOOilSulfRepository<DDOilSulf> {
    public List<DDOilSulf> findAllBySampleIdIn(List<String> sampleId);
}
