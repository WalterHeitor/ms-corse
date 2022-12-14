package com.softWalter.hroauth.dataprovider.dto;

public class RoleResponse {

    private long id;
    private String roleName;

    public RoleResponse(long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public RoleResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
