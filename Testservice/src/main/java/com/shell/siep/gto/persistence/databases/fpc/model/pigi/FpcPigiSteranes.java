package com.shell.siep.gto.persistence.databases.fpc.model.pigi;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.fpc.model.FpcDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.pigi.GTOPigiSteranes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_MS_SATURATE", schema="gfs")
public class FpcPigiSteranes extends FpcDatabaseObject implements GTOPigiSteranes, Serializable {

	@Column(name = "MS_D21")
	private Double msD21;

	@Column(name = "MS_S21")
	private Double msS21;

	@Column(name = "MS_D22")
	private Double msD22;

	@Column(name = "MS_S22")
	private Double msS22;

	@Column(name = "MS_D27BAS")
	private Double msD27bas;

	@Column(name = "MS_D27BAR")
	private Double msD27bar;

	@Column(name = "MS_D27ABS")
	private Double msD27abs;

	@Column(name = "MS_S28AAAR")
	private Double msS28aaar;

	@Column(name = "MS_S28AAAS")
	private Double msS28aaas;

	@Column(name = "MS_ISTD")
	private Double msIstd;

	@Column(name = "MS_9D28BASS")
	private Double ms9d28bass;

	@Column(name = "MS_9D28BASR")
	private Double ms9d28basr;

	@Column(name = "MS_9D28BARS")
	private Double ms9d28bars;

	@Column(name = "MS_9D28BARR")
	private Double ms9d28barr;

	@Column(name = "MS_S28ABBR")
	private Double msS28abbr;

	@Column(name = "MS_S28ABBS")
	private Double msS28abbs;

	@Column(name = "MS_DATE")
	private Date msDate;

	@Column(name = "MS_8S28ABBR")
	private Double ms8s28abbr;

	@Column(name = "MS_8S28ABBS")
	private Double ms8s28abbs;

	@Column(name = "MS_S27AAAS")
	private Double msS27aaas;

	@Column(name = "MS_S27AAAR")
	private Double msS27aaar;

	@Column(name = "MS_LAB")
	private String msLab;

	@Column(name = "MS_D27ABR")
	private Double msD27abr;

	@Column(name = "MS_S27ABBS")
	private Double msS27abbs;

	@Column(name = "MS_S27ABBR")
	private Double msS27abbr;

	@Column(name = "MS_S30AAAS")
	private Double msS30aaas;

	@Column(name = "MS_S30AAAR")
	private Double msS30aaar;

	@Column(name = "MS_S30ABBS")
	private Double msS30abbs;

	@Column(name = "MS_S30ABBR")
	private Double msS30abbr;

	@Column(name = "MS_D28BARR")
	private Double msD28barr;

	@Column(name = "MS_D28BASR")
	private Double msD28basr;

	@Column(name = "MS_D28BASS")
	private Double msD28bass;

	@Column(name = "MS_D29BAS")
	private Double msD29bas;

	@Column(name = "MS_D29BAR")
	private Double msD29bar;

	@Column(name = "MS_8S27ABBS")
	private Double ms8s27abbs;

	@Column(name = "MS_8S27ABBR")
	private Double ms8s27abbr;

	@Column(name = "MS_H30")
	private Double c30Hop;

	@Column(name = "MS_9D27BAS")
	private Double ms9d27bas;

	@Column(name = "MS_9D27BAR")
	private Double ms9d27bar;

	@Column(name = "MS_S29AAAS")
	private Double msS29aaas;

	@Column(name = "MS_S29AAAR")
	private Double msS29aaar;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "MS_S29ABBS")
	private Double msS29abbs;

	@Column(name = "MS_S29ABBR")
	private Double msS29abbr;

	@Column(name = "MS_9D29BAR")
	private Double ms9d29bar;

	@Column(name = "MS_9D29BAS")
	private Double ms9d29bas;

	@Column(name = "MS_ISTD_CONC")
	private Double msIstdConc;

	@Column(name = "MS_8S29ABBS")
	private Double ms8s29abbs;

	@Column(name = "MS_8S29ABBR")
	private Double ms8s29abbr;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "MS_8S30ABBS")
	private Double ms8s30abbs;

	@Column(name = "MS_8S30ABBR")
	private Double ms8s30abbr;

	@Override
	public String getName() {
		return AnalysisConstants.PIGI_STERANES;
	}

}
