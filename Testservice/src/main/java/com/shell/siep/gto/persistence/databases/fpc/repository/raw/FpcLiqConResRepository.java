package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOLiqConResRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcLiqConRes;
import java.util.List;

@Repository
public interface FpcLiqConResRepository extends GTOLiqConResRepository<FpcLiqConRes> {
	public List<FpcLiqConRes> findAllBySampleIdIn(List<String> sampleId);
}