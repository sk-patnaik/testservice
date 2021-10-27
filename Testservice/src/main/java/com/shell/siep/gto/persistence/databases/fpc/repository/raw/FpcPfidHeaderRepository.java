package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOPfidHeaderRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcPfidHeader;
import java.util.List;

@Repository
public interface FpcPfidHeaderRepository extends GTOPfidHeaderRepository<FpcPfidHeader> {
	public List<FpcPfidHeader> findAllBySampleIdIn(List<String> sampleId);
}