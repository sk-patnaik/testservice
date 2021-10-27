package com.shell.siep.gto.persistence.databases.dd.repository.raw;

import com.shell.siep.gto.persistence.databases.dd.model.raw.DDMsAromatic;
import com.shell.siep.gto.persistence.repository.raw.GTOMsAromaticRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDMsAromaticRepository extends GTOMsAromaticRepository<DDMsAromatic> {
    public List<DDMsAromatic> findAllBySampleIdIn(List<String> sampleId);
}
