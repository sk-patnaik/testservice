package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDOilWax;
import com.shell.siep.gto.persistence.repository.raw.GTOOilWaxRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DDOilWaxRepository extends GTOOilWaxRepository<DDOilWax> {
    public List<DDOilWax> findAllBySampleIdIn(List<String> sampleId);
}
