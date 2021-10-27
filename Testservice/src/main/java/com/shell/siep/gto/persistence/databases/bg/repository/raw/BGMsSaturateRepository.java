package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGMsSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOMsSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGMsSaturateRepository extends GTOMsSaturateRepository<BGMsSaturate> {
    public List<BGMsSaturate> findAllBySampleIdIn(List<String> sampleId);
}
