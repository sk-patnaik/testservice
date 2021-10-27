package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDLiqBtex;
import com.shell.siep.gto.persistence.repository.raw.GTOLiqBtexRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDLiqBtexRepository extends GTOLiqBtexRepository<DDLiqBtex> {
	public List<DDLiqBtex> findAllBySampleIdIn(List<String> sampleId);
}
