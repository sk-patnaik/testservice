package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiMiscBiomarkers;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_SATURATE", schema = "gfs")
public class FpcPigiMiscBiomarkers extends FpcDatabaseObject implements GTOPigiMiscBiomarkers, Serializable {

	@Column(name = "MS_DRIM")
	private Double drimane;

	@Column(name = "MS_ENTBEY")
	private Double beyerane;

	@Column(name = "MS_B_KAUR")
	private Double kaurane;

	@Column(name = "MS_HDRIM")
	private Double hdrimane;

	@Column(name = "MS_RDRIM1")
	private Double rdrimane1;

	@Column(name = "MS_RDRIM2")
	private Double rdrimane2;

	@Column(name = "MS_1MDIAM")
	private Double diamantane1m;

	@Column(name = "MS_4MDIAM")
	private Double diamantane4m;

	@Column(name = "MS_3MDIAM")
	private Double diamantane3m;

	@Column(name = "MS_DIAM")
	private Double diamantane;

	@Column(name = "MS_BICAD_R")
	private Double bicadR;

	@Column(name = "MS_BICAD_W")
	private Double bicadW;

	@Column(name = "MS_BICAD_T")
	private Double bicadT;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MS_ISOPIM")
	private Double ipimarane;

	@Column(name = "MS_RIMU")
	private Double ntcyclane;

	@Column(name = "MS_BCAROT")
	private Double bcarot;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_MISC_BIOMARKERS;
	}

}
