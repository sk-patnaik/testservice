package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiAromatics;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_AROMATIC", schema = "gfs")
public class FpcPigiAromatics extends FpcDatabaseObject implements GTOPigiAromatics, Serializable {

	@Column(name = "MA_NAPH")
	private Double maNaph;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MA_CAD")
	private Double cad;

	@Column(name = "MA_NAPH_15DM")
	private Double dmn15;

	@Column(name = "MA_DBT")
	private Double dbt;

	@Column(name = "MA_BIPHEN")
	private Double bp;

	@Column(name = "MA_BIPHEN_4M")
	private Double mbp4;

	@Column(name = "MA_BIPHEN_2M")
	private Double mbp2;

	@Column(name = "MA_BIPHEN_3M")
	private Double mbp3;

	@Column(name = "MA_BIPHEN_2E")
	private Double biphen2e;

	@Column(name = "MA_BIPHEN_3E")
	private Double biphen3e;

	@Column(name = "MA_BIPHEN_4E")
	private Double biphen4e;

	@Column(name = "MA_NAPH_26_27DM")
	private Double dmn2627;

	@Column(name = "MA_DATE")
	private Date maAcqDate;

	@Column(name = "MA_DBT_23M")
	private Double mdbt23;

	@Column(name = "MA_DBT_1M")
	private Double mdbt1;

	@Column(name = "MA_DBT_4M")
	private Double mdbt4;

	@Column(name = "MA_NAPH_2M")
	private Double mn2;

	@Column(name = "MA_NAPH_1M")
	private Double mn1;

	@Column(name = "MA_LAB")
	private String maLab;

	@Column(name = "MA_ISTD")
	private Double pdp;

	@Column(name = "MA_PHEN_1MP")
	private Double mp1;

	@Column(name = "MA_PHEN_2MP")
	private Double mp2;

	@Column(name = "MA_PHEN_3MP")
	private Double mp3;

	@Column(name = "MA_PHEN_9MP")
	private Double mp9;

	@Column(name = "MA_ISTD_CONC")
	private Double maIstdConc;

	@Column(name = "MA_RETENE")
	private Double retene;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_AROMATICS;
	}


}
