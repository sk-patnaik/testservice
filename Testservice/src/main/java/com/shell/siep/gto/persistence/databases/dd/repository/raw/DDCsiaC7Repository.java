package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDCsiaC7;
import com.shell.siep.gto.persistence.repository.raw.GTOCsiaC7Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDCsiaC7Repository extends GTOCsiaC7Repository<DDCsiaC7> {
	public List<DDCsiaC7> findAllBySampleIdIn(List<String> sampleId);
}
