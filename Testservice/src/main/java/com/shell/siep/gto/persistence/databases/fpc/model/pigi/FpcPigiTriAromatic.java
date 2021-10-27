package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiTriAromatic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_AROMATIC", schema = "gfs")
public class FpcPigiTriAromatic extends FpcDatabaseObject implements GTOPigiTriAromatic, Serializable {

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MA_TA_28R")
	private Double taC2820r;

	@Column(name = "MA_TA_26S")
	private Double taC2620s;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MA_TA_27S_26R")
	private Double taC2620rC2720s;

	@Column(name = "MA_TA_21")
	private Double taC21;

	@Column(name = "MA_TA_20")
	private Double taC20;

	@Column(name = "MA_TA_29_3")
	private Double taC2920r;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_TRI_AROMATICS;
	}


}
