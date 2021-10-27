package com.shell.siep.gto.persistence.databases.fpc.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.fpc.model.FpcWell;
import com.shell.siep.gto.persistence.repository.GTOWellRepository;

@Repository
public interface FpcWellRepository extends JpaSpecificationExecutor<FpcWell>, GTOWellRepository<FpcWell, String> {

    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    List<FpcWell> findAll(@Nullable Specification<FpcWell> spec);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from FpcWell w where upper(w.country.countryName) in :countries")
    List<Object[]> findIdsFromCountries(@Param("countries") List<String> countries);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from FpcWell w where upper(w.wellId) in :wellIds")
    List<Object[]> findExistingIds(@Param("wellIds") List<String> wellIds);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from FpcWell w where upper(w.wellId) in :wellIds and " +
            "upper(w.country.countryName) in :countries")
    List<Object[]> findExistingIds(@Param("countries") List<String> countries, @Param("wellIds") List<String> wellIds);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from FpcWell w where upper(w.wellId) like %:wellId%")
    List<Object[]> findWellId(@Param("wellId") String wellId);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select 'FPC', w.wellId, w.whLat, w.whLong from FpcWell w where " +
            "(coalesce(:countries, null) is null or w.country.countryName in (:countries)) and " +
            "(coalesce(:wellIds, null) is null or w.wellId in (:wellIds))")
    List<Object[]> findWellIdWithLatLong(@Param("countries") List<String> countries, @Param("wellIds") List<String> wellIds);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select 'FPC', w.wellId, w.whLat, w.whLong from FpcWell w " +
            "left join w.samples s where s.shWellId = w.wellId and s.sampleId in :sampleIds and " +
            "(coalesce(:countries, null) is null or w.country.countryName in (:countries)) and " +
            "(coalesce(:wellIds, null) is null or w.wellId in (:wellIds))")
    List<Object[]> findWellIdWithLatLongBySamples(@Param("countries") List<String> countries, @Param("wellIds") List<String> wellIds,
                                         @Param("sampleIds") List<String> sampleIds);
}
