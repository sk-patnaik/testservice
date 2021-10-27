package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDMsMs;
import com.shell.siep.gto.persistence.repository.raw.GTOMsMsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDMsMsRepository extends GTOMsMsRepository<DDMsMs> {
	public List<DDMsMs> findAllBySampleIdIn(List<String> sampleId);
}
