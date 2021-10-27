package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcIsotopesGas;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesGasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FpcIsotopesGasRepository extends GTOIsotopesGasRepository<FpcIsotopesGas> {
    public List<FpcIsotopesGas> findAllBySampleIdIn(List<String> sampleId);
}
