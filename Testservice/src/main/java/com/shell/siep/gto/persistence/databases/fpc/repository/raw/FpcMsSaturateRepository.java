package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcMsSaturate;
import com.shell.siep.gto.persistence.repository.raw.GTOMsSaturateRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcMsSaturateRepository extends GTOMsSaturateRepository<FpcMsSaturate> {
    public List<FpcMsSaturate> findAllBySampleIdIn(List<String> sampleId);
}
