package com.shell.siep.gto.persistence.databases.tellus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.tellus.model.TellusWells;
import com.shell.siep.gto.persistence.repository.GTOWellRepository;

@Repository
public interface TellusWellRepository extends JpaSpecificationExecutor<TellusWells>, GTOWellRepository<TellusWells, String> {

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from TellusWells w where upper(w.country.countryName) in :countries")
    List<Object[]> findIdsFromCountries(@Param("countries") List<String> countries);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from TellusWells w where upper(w.wellId) like %:wellId%")
    List<Object[]> findWellId(@Param("wellId") String wellId);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select w.wellId from FpcWell w where (:countries is null or w.country.countryName in :countries) " +
            "and (:wellIds is null or w.wellId in :wellIds)"
    )
    List<Object[]> findWellIdWithLatLong(@Param("countries") List<String> countries, @Param("wellIds") List<String> wellIds);

    @Override
    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select 'FPC', w.wellId, w.whLat, w.whLong from FpcWell w " +
            "left join w.samples s where s.shWellId = w.wellId and " +
            "(coalesce(:countries, null) is null or w.country.countryName in (:countries)) and " +
            "(coalesce(:wellIds, null) is null or w.wellId in (:wellIds))")
    List<Object[]> findWellIdWithLatLongBySamples(@Param("countries") List<String> countries, @Param("wellIds") List<String> wellIds,
                                                  @Param("sampleIds") List<String> sampleIds);
}
