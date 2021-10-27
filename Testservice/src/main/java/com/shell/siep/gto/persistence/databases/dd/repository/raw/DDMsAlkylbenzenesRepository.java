package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDMsAlkylbenzenes;
import com.shell.siep.gto.persistence.repository.raw.GTOMsAlkylbenzenesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDMsAlkylbenzenesRepository extends GTOMsAlkylbenzenesRepository<DDMsAlkylbenzenes> {
	public List<DDMsAlkylbenzenes> findAllBySampleIdIn(List<String> sampleId);
}
