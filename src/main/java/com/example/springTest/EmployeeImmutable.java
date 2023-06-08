package com.example.springTest;

public final class EmployeeImmutable {
  private final String name;
  private final Organization organization;

  public EmployeeImmutable(String name, Organization organization) {
    Organization org = new Organization
            (organization.getOrgName(),organization.getOrgCode());
    this.name = name;
    this.organization = org;
  }

  public String getName() {
    return name;
  }

  public Organization getOrganization() {
    return new Organization(organization.getOrgName(),organization.getOrgCode());
  }
}

class Organization{
  private String orgName;
  private String orgCode;

  public Organization(String orgName, String orgCode) {
    this.orgName = orgName;
    this.orgCode = orgCode;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public String getOrgCode() {
    return orgCode;
  }

  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }
}
