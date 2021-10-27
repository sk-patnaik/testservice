package com.shell.siep.gto.persistence.repository.pigi;

import com.shell.siep.gto.persistence.model.pigi.GTOPigiBaseInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface GTOPigiBaseInfoRepository<T, S> extends PagingAndSortingRepository<T, S> {
    List<GTOPigiBaseInfo> findAllById(List<String> sampleIds);
}
