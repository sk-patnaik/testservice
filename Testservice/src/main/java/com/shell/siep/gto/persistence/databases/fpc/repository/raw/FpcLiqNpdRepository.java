package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqNpdRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqNpd;
import java.util.List;

@Repository
public interface FpcLiqNpdRepository extends GTOLiqNpdRepository<FpcLiqNpd> {
	public List<FpcLiqNpd> findAllBySampleIdIn(List<String> sampleId);
}