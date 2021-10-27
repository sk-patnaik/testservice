package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDMsSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOMsSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDMsSaturateRepository extends GTOMsSaturateRepository<DDMsSaturate> {
    public List<DDMsSaturate> findAllBySampleIdIn(List<String> sampleId);
}
