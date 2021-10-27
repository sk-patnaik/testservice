package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOMsAlkylbenzenesRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcMsAlkylbenzenes;
import java.util.List;

@Repository
public interface FpcMsAlkylbenzenesRepository extends GTOMsAlkylbenzenesRepository<FpcMsAlkylbenzenes> {
	public List<FpcMsAlkylbenzenes> findAllBySampleIdIn(List<String> sampleId);
}