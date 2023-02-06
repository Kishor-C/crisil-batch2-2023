package com.crisil;

public class MySql implements Dbi {
	@Override
	public void save() {
		System.out.println("saves in MySql");
	}
}
