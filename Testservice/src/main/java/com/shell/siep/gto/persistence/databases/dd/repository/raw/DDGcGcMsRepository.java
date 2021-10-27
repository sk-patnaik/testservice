package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcGcMs;
import com.shell.siep.gto.persistence.repository.raw.GTOGcGcMsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcGcMsRepository extends GTOGcGcMsRepository<DDGcGcMs> {
	public List<DDGcGcMs> findAllBySampleIdIn(List<String> sampleId);
}
