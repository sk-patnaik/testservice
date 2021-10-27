package com.shell.siep.gto.persistence.databases.sgs.repository.raw;

import com.shell.siep.gto.persistence.databases.sgs.model.SGSChnos;
import com.shell.siep.gto.persistence.repository.raw.GTOChnosRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGSChnosRepository extends GTOChnosRepository<SGSChnos> {
	public List<SGSChnos> findAllBySampleIdIn(List<String> sampleId);
}
