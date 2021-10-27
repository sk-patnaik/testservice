package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDPfidHeader;
import com.shell.siep.gto.persistence.repository.raw.GTOPfidHeaderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPfidHeaderRepository extends GTOPfidHeaderRepository<DDPfidHeader> {
	public List<DDPfidHeader> findAllBySampleIdIn(List<String> sampleId);
}
