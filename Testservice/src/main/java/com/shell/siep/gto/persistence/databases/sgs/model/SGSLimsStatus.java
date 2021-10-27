package com.shell.siep.gto.persistence.databases.sgs.model;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

import com.shell.siep.gto.persistence.model.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(GTOLimsStatusKey.class)
@Table(name="WTC_LIMS_STATUS", schema="sgs_data")
public class SGSLimsStatus extends SGSDatabaseObject implements GTOLimsStatus, Serializable {

	@Id
	@Column(name = "REQUEST_ID")
	private String measRequest;

	@Id
	@Column(name = "SAMPLE_ID")
	private String measSampleId;

	@Column(name = "UPDATED_DATE")
	private Date measLastUpdate;

	@Column(name = "STATUS")
	private String stat;
}
