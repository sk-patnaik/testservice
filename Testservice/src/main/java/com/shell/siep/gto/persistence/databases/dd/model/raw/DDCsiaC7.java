package com.shell.siep.gto.persistence.databases.dd.model.raw;

import com.shell.siep.gto.commons.AnalysisConstants;
import com.shell.siep.gto.persistence.databases.dd.model.DDDatabaseObject;
import com.shell.siep.gto.persistence.model.GTOAnalysisKey;
import com.shell.siep.gto.persistence.model.raw.GTOCsiaC7;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(GTOAnalysisKey.class)
@Table(name="FPC_CSIA_C7")
public class DDCsiaC7 extends DDDatabaseObject implements GTOCsiaC7, Serializable {

	@Column(name = "CSIA_C7_COMMENT")
	private String csiaC7Comment;

	@Column(name = "QC_DATE")
	private Date csiaC7QcDate;

	@Column(name = "QC_USER")
	private String csiaC7QcUser;

	@Column(name = "CSIA_C7_24DMH")
	private Double csiaC724dmh;

	@Column(name = "CSIA_C7_24DMP")
	private Double csiaC724dmp;

	@Column(name = "CSIA_C7_1C2DMCP")
	private Double csiaC71c2dmcp;

	@Column(name = "CSIA_C7_1T2DMCP")
	private Double csiaC71t2dmcp;

	@Id
	@Column(name = "SAMPLE_ID")
	private String sampleId;

	@Column(name = "CSIA_C7_113TMCP")
	private Double csiaC7113tmcp;

	@Column(name = "CSIA_C7_CP")
	private Double csiaC7Cp;

	@Column(name = "CSIA_C7_CH")
	private Double csiaC7Ch;

	@Column(name = "CSIA_N2")
	private Double csiaC7N2;

	@Column(name = "CSIA_C7_224TMP")
	private Double csiaC7224tmp;

	@Column(name = "CSIA_C7_25DMH")
	private Double csiaC725dmh;

	@Column(name = "LAST_UPDATE")
	private Date csiaC7LastUpdate;

	@Column(name = "CSIA_C7_DATA_TYPE")
	private String csiaC7DataType;

	@Column(name = "CSIA_C7_TOL")
	private Double csiaC7Tol;

	@Column(name = "CSIA_C7_2MH")
	private Double csiaC72mh;

	@Column(name = "CSIA_C7_2MP")
	private Double csiaC72mp;

	@Column(name = "CSIA_C7_QC")
	private String csiaC7Qc;

	@Column(name = "CSIA_C7_ECP")
	private Double csiaC7Ecp;

	@Column(name = "CSIA_C7_3EP")
	private Double csiaC73ep;

	@Column(name = "CSIA_C7_DATE")
	private Date csiaC7AcqDate;

	@Column(name = "CSIA_C7_DATE", insertable = false, updatable = false)
	private Date csiaC7Date;

	@Column(name = "CSIA_C7_223TMB")
	private Double csiaC7223tmb;

	@Column(name = "CSIA_C7_3MP")
	private Double csiaC73mp;

	@Column(name = "CSIA_C7_223TMP")
	private Double csiaC7223tmp;

	@Column(name = "CSIA_C7_3MH")
	private Double csiaC73mh;

	@Column(name = "CSIA_C7_123TMCP")
	private Double csiaC7123tmcp;

	@Column(name = "CSIA_C7_1T3DMCP")
	private Double csiaC71t3dmcp;

	@Column(name = "CSIA_C7_1C3DMCP")
	private Double csiaC71c3dmcp;

	@Column(name = "CSIA_C7_AUTHOR")
	private String csiaC7Author;

	@Column(name = "CSIA_C7_ETHENE")
	private Double csiaC7Ethene;

	@Column(name = "CSIA_C7_33DMP")
	private Double csiaC733dmp;

	@Column(name = "CSIA_C7_IC4")
	private Double csiaC7Ic4;

	@Column(name = "CSIA_C7_IC5")
	private Double csiaC7Ic5;

	@Column(name = "CSIA_C7_PROPENE")
	private Double csiaC7Propene;

	@Id
	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "CSIA_C7_C10")
	private Double csiaC7Nc10;

	@Column(name = "SVC_CODE")
	private String csiaC7SvcCode;

	@Column(name = "CSIA_C7_11DMCP")
	private Double csiaC711dmcp;

	@Column(name = "CSIA_C7_NC3")
	private Double csiaC7Nc3;

	@Column(name = "CSIA_C7_NC4")
	private Double csiaC7Nc4;

	@Column(name = "CSIA_C7_NC1")
	private Double csiaC7Nc1;

	@Column(name = "CSIA_C7_NC2")
	private Double csiaC7Nc2;

	@Column(name = "CSIA_C7_NC7")
	private Double csiaC7Nc7;

	@Column(name = "CSIA_C7_NC8")
	private Double csiaC7Nc8;

	@Column(name = "CSIA_C7_NC5")
	private Double csiaC7Nc5;

	@Column(name = "CSIA_C7_NC6")
	private Double csiaC7Nc6;

	@Column(name = "SAMPLE_ID_VEND")
	private String csiaC7SampleIdVend;

	@Column(name = "CSIA_C7_22DMP")
	private Double csiaC722dmp;

	@Column(name = "CSIA_C7_22DMH")
	private Double csiaC722dmh;

	@Column(name = "CSIA_C7_22DMB")
	private Double csiaC722dmb;

	@Column(name = "RUN_NUMBER")
	private String csiaC7RunNumber;

	@Column(name = "CSIA_C7_BENZ")
	private Double csiaC7Benz;

	@Column(name = "CSIA_C7_METHOD")
	private String csiaC7Method;

	@Column(name = "IQM_CODE")
	private String csiaC7IqmCode;

	@Column(name = "JOB_ID")
	private String csiaC7JobId;

	@Column(name = "CSIA_C7_LAB")
	private String csiaC7Lab;

	@Column(name = "CSIA_C7_124TMCP")
	private Double csiaC7124tmcp;

	@Column(name = "CSIA_C7_23DMP")
	private Double csiaC723dmp;

	@Column(name = "CSIA_C7_23DMB")
	private Double csiaC723dmb;

	@Column(name = "CSIA_C7_MCH")
	private Double csiaC7Mch;

	@Column(name = "CSIA_C7_MCP")
	private Double csiaC7Mcp;


	@Override
	public String getName() {
		 return AnalysisConstants.CSIA_C7;
	}
}
