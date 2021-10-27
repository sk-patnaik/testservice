package com.shell.siep.gto.persistence.databases.dd.repository.pigi;

import com.shell.siep.gto.persistence.databases.dd.model.pigi.DDPigiIsotopeParameters;
import com.shell.siep.gto.persistence.repository.GTOAnalysisRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DDPigiIsotopeParametersRepository extends GTOAnalysisRepository<DDPigiIsotopeParameters> {
    public List<DDPigiIsotopeParameters> findAllBySampleIdIn(List<String> sampleId);
}
