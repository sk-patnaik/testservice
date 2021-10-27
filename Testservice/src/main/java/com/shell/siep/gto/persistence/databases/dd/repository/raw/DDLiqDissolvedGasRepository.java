package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqDissolvedGas;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqDissolvedGasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqDissolvedGasRepository extends GTOLiqDissolvedGasRepository<DDLiqDissolvedGas> {
	public List<DDLiqDissolvedGas> findAllBySampleIdIn(List<String> sampleId);
}
