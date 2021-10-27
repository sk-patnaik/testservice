package com.shell.siep.gto.services.extractors;

import com.shell.siep.gto.persistence.model.GTOSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class SampleFromSampleIdExtractor extends SampleFromIdExtractor{

    private static final String OBJECT_NAME = "Sample";

    @Override
    public List<GTOSample> findByFPCIds(List<String> ids, GTOSampleRepository<GTOSample, String> repository, Pageable pageable) {
        return repository.findAllBySampleIds(ids, pageable);
    }

    @Override
    public List<GTOSample> findByFPCIds(List<String> ids, List<String> types, GTOSampleRepository<GTOSample, String> repository, Pageable pageable) {
        return repository.findAllBySampleIds(ids, types, pageable);
    }

    public String getObjectName() {
        return OBJECT_NAME;
    }

}
