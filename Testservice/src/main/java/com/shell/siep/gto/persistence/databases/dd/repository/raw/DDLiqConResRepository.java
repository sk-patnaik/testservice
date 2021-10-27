package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqConRes;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqConResRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqConResRepository extends GTOLiqConResRepository<DDLiqConRes> {
	public List<DDLiqConRes> findAllBySampleIdIn(List<String> sampleId);
}
