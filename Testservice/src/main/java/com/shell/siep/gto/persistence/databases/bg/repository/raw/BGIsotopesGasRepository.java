package com.shell.siep.gto.persistence.databases.bg.repository.raw;

import com.shell.siep.gto.persistence.databases.bg.model.raw.BGIsotopesGas;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesGasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BGIsotopesGasRepository extends GTOIsotopesGasRepository<BGIsotopesGas> {
    public List<BGIsotopesGas> findAllBySampleIdIn(List<String> sampleId);
}
