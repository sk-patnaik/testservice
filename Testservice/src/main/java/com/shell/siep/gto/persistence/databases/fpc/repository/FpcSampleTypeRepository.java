package com.shell.siep.gto.persistence.databases.fpc.repository;

import com.shell.siep.gto.persistence.databases.fpc.model.FpcSampleType;
import com.shell.siep.gto.persistence.repository.GTOSampleTypeRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface FpcSampleTypeRepository extends GTOSampleTypeRepository<FpcSampleType> {

    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="20"))
    @Query(value = "select t from FpcSampleType t where t.parent is null")
    List<FpcSampleType> findSampleTypes();
}
