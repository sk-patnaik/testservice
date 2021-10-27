package com.shell.siep.gto.persistence.databases.dd.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiGasolines;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_GC_GASOLINE")
public class DDPigiGasolines extends DDDatabaseObject implements GTOPigiGasolines, Serializable {

	@Column(name = "G7_24DMP")
	private Double x24dmp;

	@Column(name = "G7_223TMP")
	private Double x223tmp;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "G7_TOL")
	private Double tol;

	@Column(name = "G7_2MH")
	private Double x2mh;

	@Column(name = "G7_3EP")
	private Double x3ep;

	@Column(name = "G7_NC5")
	private Double c5;

	@Column(name = "G7_NC6")
	private Double c6;

	@Column(name = "G7_NC7")
	private Double c7;

	@Column(name = "G7_CH")
	private Double ch;

	@Column(name = "G7_CP")
	private Double cp;

	@Column(name = "G7_3MH")
	private Double x3mh;

	@Column(name = "G7_3MP")
	private Double x3mp;

	@Column(name = "G7_LAB")
	private String g7Lab;

	@Column(name = "G7_ECP")
	private Double ecp;

	@Column(name = "G7_23DMB")
	private Double x23dmb;

	@Column(name = "G7_BZ")
	private Double benz;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "G7_DATE")
	private Date g7Date;

	@Column(name = "G7_22DMB")
	private Double x22dmb;

	@Column(name = "G7_22DMP")
	private Double x22dmp;

	@Column(name = "G7_2MB")
	private Double ic5;

	@Column(name = "G7_2MPR")
	private Double ic4;

	@Column(name = "G7_11DMCP")
	private Double x11dmcp;

	@Column(name = "G7_1C3DMCP")
	private Double x1c3dmcp;

	@Column(name = "G7_1T3DMCP")
	private Double x1t3dmcp;

	@Column(name = "G7_ISTD_CONC")
	private Double g7IstdConc;

	@Column(name = "G7_33DMP")
	private Double x33dmp;

	@Column(name = "G7_1T2DMCP")
	private Double x1t2dmcp;

	@Column(name = "G7_MCH")
	private Double mch;

	@Column(name = "G7_ISTD")
	private Double g7Istd;

	@Column(name = "G7_MCH_1C2DMCP")
	private Double mch1c2dmcp;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_GASOLINES;
	}

}
