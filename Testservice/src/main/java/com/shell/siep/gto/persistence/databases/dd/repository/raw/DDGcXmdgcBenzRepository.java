package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDGcXmdgcBenz;
import com.shell.siep.gto.persistence.repository.raw.GTOGcXmdgcBenzRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDGcXmdgcBenzRepository extends GTOGcXmdgcBenzRepository<DDGcXmdgcBenz> {
	public List<DDGcXmdgcBenz> findAllBySampleIdIn(List<String> sampleId);
}
