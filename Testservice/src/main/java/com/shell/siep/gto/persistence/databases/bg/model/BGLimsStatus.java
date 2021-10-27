package com.shell.siep.gto.persistence.databases.bg.model;

import com.shell.siep.gto.persistence.model.GTOLimsStatus;
import com.shell.siep.gto.persistence.model.GTOLimsStatusKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(GTOLimsStatusKey.class)
@Table(name="FPC_LIMS_STATUS")
public class BGLimsStatus extends BGDatabaseObject implements GTOLimsStatus, Serializable {

	@Id
	@Column(name = "REQUEST_ID")
	private String measRequest;

	@Column(name = "LAST_UPDATE")
	private Date measLastUpdate;

	@Column(name = "STATUS")
	private String stat;

	@Id
	@Column(name = "SAMPLE_ID")
	private String measSampleId;

}
