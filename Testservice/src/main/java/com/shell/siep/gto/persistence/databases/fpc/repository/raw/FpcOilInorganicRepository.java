package com.shell.siep.gto.persistence.databases.fpc.repository.raw;

import com.shell.siep.gto.persistence.repository.raw.GTOOilInorganicRepository;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilInorganic;
import java.util.List;

@Repository
public interface FpcOilInorganicRepository extends GTOOilInorganicRepository<FpcOilInorganic> {
	public List<FpcOilInorganic> findAllBySampleIdIn(List<String> sampleId);
}