package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDIsotopesGas;
import com.shell.siep.gto.persistence.repository.raw.GTOIsotopesGasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDIsotopesGasRepository extends GTOIsotopesGasRepository<DDIsotopesGas> {
    public List<DDIsotopesGas> findAllBySampleIdIn(List<String> sampleId);
}
