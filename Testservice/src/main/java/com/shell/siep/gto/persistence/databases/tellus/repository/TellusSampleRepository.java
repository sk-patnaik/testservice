package com.shell.siep.gto.persistence.databases.tellus.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shell.siep.gto.persistence.databases.tellus.model.TellusSample;
import com.shell.siep.gto.persistence.repository.GTOSampleRepository;

@Repository
public interface TellusSampleRepository extends GTOSampleRepository<TellusSample, String> {

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from TellusSample s where upper(s.shWellId) in :wellIds")
    List<Object[]> findNamesByWellIds(@Param("wellIds") List<String> wellIds);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from TellusSample s where upper(s.well.fpcCountry.countryName) in :countries")
    List<Object[]> findNamesByCountries(@Param("countries") List<String> countries);

    @QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from TellusSample s where upper(s.well.fpcCountry.countryName) in :countries")
    List<Object[]> findNamesByCountries(@Param("countries") List<String> countries, @Param("sampleTypes") List<String> sampleTypes);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from TellusSample s where s.shWellId in :wellIds")
    List<TellusSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from TellusSample s where s.shWellId in :wellIds")
    List<TellusSample> findByFpcWellWellIds(@Param("wellIds") List<String> wellIds, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select * from duel", nativeQuery = true)
    List<TellusSample> findByCountry(@Param("countries") List<String> countries, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="500"))
    List<TellusSample> findAllBySampleIds(@Param("sampleIds") List<String> sampleIds, Pageable pageable);

    @Override
	@QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select * from duel", nativeQuery = true)
    List<TellusSample> findByCountry(@Param("countries") List<String> countries, @Param("sampleTypes") List<String> sampleTypes, Pageable pageable);

    @Override
	@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s.sampleId from TellusSample s where upper(s.sampleId) like %:sampleId%")
    List<Object[]> findSampleId(@Param("sampleId") String sampleId);

    @Override
    @QueryHints(@QueryHint(name="org.hibernate.fetchSize", value="5000"))
    @Query(value = "select s from TellusSample s where s.sampleId in :sampleIds")
    List<TellusSample> findSamplesBySampleIds(@Param("sampleIds") List<String> sampleIds);
}
