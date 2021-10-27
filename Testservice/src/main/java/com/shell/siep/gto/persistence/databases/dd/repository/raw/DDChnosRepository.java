package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDChnos;
import com.shell.siep.gto.persistence.repository.raw.GTOChnosRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDChnosRepository extends GTOChnosRepository<DDChnos> {
	public List<DDChnos> findAllBySampleIdIn(List<String> sampleId);
}
