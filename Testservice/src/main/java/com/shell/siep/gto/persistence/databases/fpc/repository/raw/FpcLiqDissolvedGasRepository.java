package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqDissolvedGasRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqDissolvedGas;
import java.util.List;

@Repository
public interface FpcLiqDissolvedGasRepository extends GTOLiqDissolvedGasRepository<FpcLiqDissolvedGas> {
	public List<FpcLiqDissolvedGas> findAllBySampleIdIn(List<String> sampleId);
}