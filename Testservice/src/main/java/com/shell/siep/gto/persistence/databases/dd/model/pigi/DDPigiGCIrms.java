package com.shell.siep.gto.persistence.databases.dd.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiGClrms;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_ISOTOPES_GAS")
public class DDPigiGCIrms extends DDDatabaseObject implements GTOPigiGClrms, Serializable {

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "DC_G_PH")
	private Double csiaPh;

	@Column(name = "DC_G_PR")
	private Double csiaPr;

	@Column(name = "D_G_LAB")
	private String dGLab;

	@Column(name = "DC_G_NC2")
	private Double csiaNc2;

	@Column(name = "DC_G_NC3")
	private Double csiaNc3;

	@Column(name = "DC_G_NC1")
	private Double csiaNc1;

	@Column(name = "DC_G_NC8")
	private Double csiaNc8;

	@Column(name = "DC_G_NC9")
	private Double csiaNc9;

	@Column(name = "DC_G_NC6")
	private Double csiaNc6;

	@Column(name = "DC_G_NC7")
	private Double csiaNc7;

	@Column(name = "DC_G_NC4")
	private Double csiaNc4;

	@Column(name = "DC_G_NC5")
	private Double csiaNc5;

	@Column(name = "DC_G_NC29")
	private Double csiaNc29;

	@Column(name = "DC_G_NC28")
	private Double csiaNc28;

	@Column(name = "DC_G_NC27")
	private Double csiaNc27;

	@Column(name = "DC_G_NC26")
	private Double csiaNc26;

	@Column(name = "DC_G_NC21")
	private Double csiaNc21;

	@Column(name = "DC_G_NC20")
	private Double csiaNc20;

	@Column(name = "DC_G_NC25")
	private Double csiaNc25;

	@Column(name = "DC_G_NC24")
	private Double csiaNc24;

	@Column(name = "DC_G_NC23")
	private Double csiaNc23;

	@Column(name = "DC_G_NC22")
	private Double csiaNc22;

	@Column(name = "DC_G_NC32")
	private Double csiaNc32;

	@Column(name = "DC_G_NC31")
	private Double csiaNc31;

	@Column(name = "DC_G_NC30")
	private Double csiaNc30;

	@Column(name = "DC_G_NC35")
	private Double csiaNc35;

	@Column(name = "DC_G_NC34")
	private Double csiaNc34;

	@Column(name = "DC_G_NC33")
	private Double csiaNc33;

	@Column(name = "DC_G_NC18")
	private Double csiaNc18;

	@Column(name = "DC_G_NC17")
	private Double csiaNc17;

	@Column(name = "DC_G_NC16")
	private Double csiaNc16;

	@Column(name = "DC_G_NC15")
	private Double csiaNc15;

	@Column(name = "DC_G_NC19")
	private Double csiaNc19;

	@Column(name = "DC_G_NC10")
	private Double csiaNc10;

	@Column(name = "DC_G_NC14")
	private Double csiaNc14;

	@Column(name = "DC_G_NC13")
	private Double csiaNc13;

	@Column(name = "DC_G_NC12")
	private Double csiaNc12;

	@Column(name = "DC_G_NC11")
	private Double csiaNc11;

	@Column(name = "DC_G_IC18")
	private Double csiaIc18;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "D_G_DATE")
	private Date dGAcqDate;

	@Column(name = "D_G_COMMENT")
	private String dGComments;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_GC_IRMS;
	}

}
