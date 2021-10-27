package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiTerpanes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_SATURATE", schema = "gfs")
public class FpcPigiTerpanes extends FpcDatabaseObject implements GTOPigiTerpanes, Serializable {

	@Column(name = "MS_H32R")
	private Double c3222r;

	@Column(name = "MS_H32S")
	private Double c3222s;

	@Column(name = "MS_TR29B")
	private Double c29b3;

	@Column(name = "MS_TR30B")
	private Double c30b3;

	@Column(name = "MS_DH30")
	private Double diah;

	@Column(name = "MS_OL")
	private Double x18aOl;

	@Column(name = "MS_TR29A")
	private Double c29a3;

	@Column(name = "MS_TR30A")
	private Double c30a3;

	@Column(name = "MS_TR28A")
	private Double c28a3;

	@Column(name = "MS_H35S")
	private Double c3522s;

	@Column(name = "MS_H35R")
	private Double c3522r;

	@Column(name = "MS_TR19")
	private Double c193;

	@Column(name = "MS_TS")
	private Double c27Ts;

	@Column(name = "MS_TM")
	private Double c27Tm;

	@Column(name = "MS_H34R")
	private Double c3422r;

	@Column(name = "MS_H34S")
	private Double c3422s;

	@Column(name = "MS_C29TS")
	private Double c29Ts;

	@Column(name = "MS_TR25A")
	private Double c25a3;

	@Column(name = "MS_TR25B")
	private Double c25b3;

	@Column(name = "MS_GAM")
	private Double gammace;

	@Column(name = "MS_TR26A")
	private Double c26a3;

	@Column(name = "MS_25NH29")
	private Double nh29a;

	@Column(name = "MS_TR20")
	private Double c203;

	@Column(name = "MS_H29")
	private Double c29Hop;

	@Column(name = "MS_TR21")
	private Double c213;

	@Column(name = "MS_H31S")
	private Double c3122s;

	@Column(name = "MS_H31R")
	private Double c3122r;

	@Column(name = "MS_M30")
	private Double mor;

	@Column(name = "MS_H30")
	private Double c30Hop;

	@Column(name = "MS_TR22")
	private Double c223;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MS_TR26B")
	private Double c26b3;

	@Column(name = "MS_H28")
	private Double bnrh;

	@Column(name = "MS_TR23")
	private Double c233;

	@Column(name = "MS_TET24")
	private Double c244;

	@Column(name = "MS_TR24")
	private Double c243;

	@Column(name = "MS_TR28B")
	private Double c28b3;

	@Column(name = "MS_M29")
	private Double normor;

	@Column(name = "MS_H33S")
	private Double c3322s;

	@Column(name = "MS_H33R")
	private Double c3322r;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_TERPANES;
	}

}
