package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.databases.fpc.model.raw.FpcOilGross;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiExtract;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ROCK_EXTR", schema ="gfs")
public class FpcPigiExtract extends FpcDatabaseObject implements GTOPigiExtract, Serializable {

	@Column(name = "EX_EX_WT")
	private Double exExWt;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "EX_METHOD")
	private String exMethod;

	@Column(name = "EX_ROCK_WT")
	private Double exRockWt;

	@Column(name = "EX_LAB")
	private String exLab;

	@Column(name = "EX_EX_PCT")
	private Double exExPct;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "EX_DATE")
	private Date exAcqDate;

	@OneToOne
	@JsonIgnore
	@JoinColumn(updatable=false,insertable=false, name="SAMPLE_ID", referencedColumnName="SAMPLE_ID")
	@JoinColumn(updatable=false,insertable=false, name="REQUEST_ID", referencedColumnName="REQUEST_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private FpcOilGross gross;

	@Override
	public Double getGrossWlt() {
		return (gross == null)? null: gross.getGrossWlt();
	}

	@Override
	public Double getAro() {
		return (gross == null)? null: gross.getAro();
	}

	@Override
	public Double getHetero() {
		return (gross == null)? null: gross.getHetero();
	}

	@Override
	public Double getAsp() {
		return (gross == null)? null: gross.getAsp();
	}

	@Override
	public Double getRest() {
		return (gross == null)? null: gross.getRest();
	}

	@Override
	public Double getSat() {
		return (gross == null)? null: gross.getSat();
	}

	@Override
	public String getName() {
		 return AnalysisConstants.PIGI_EXTRACT;
	}
}
