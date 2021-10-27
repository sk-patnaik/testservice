package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqNpd;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqNpdRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqNpdRepository extends GTOLiqNpdRepository<DDLiqNpd> {
	public List<DDLiqNpd> findAllBySampleIdIn(List<String> sampleId);
}
