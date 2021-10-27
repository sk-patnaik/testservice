package com.shell.siep.gto.commons.enums;

public enum UserRoleEnum {
	ROLE_USER("USER"),
	ROLE_ADMIN("ADMIN"),
	ROLE_SUPERADMIN("SADMIN");

	private String roleName;
	
	UserRoleEnum(String role) {
		if(role.isBlank())
			role = "USER";
		roleName = role;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
