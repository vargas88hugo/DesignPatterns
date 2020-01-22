package com.adapter.adapter01;

/**
 * A class adapter, works as two way direction
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}
