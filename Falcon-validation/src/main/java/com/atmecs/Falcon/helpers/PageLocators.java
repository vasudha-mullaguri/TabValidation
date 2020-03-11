package com.atmecs.Falcon.helpers;

import java.util.Properties;

import com.atmecs.Falcon.constants.FilePaths;
import com.atmecs.Falcon.utils.ReadProperties;

public class PageLocators {

	Properties property;
	public String dashboard;
	public String recentRuns;
	public String view;
	public String dashboardele;
	public String recent;
	

	public void  data() throws Exception {
		
	property=ReadProperties.loadProperty(FilePaths.LOGIN);
	setDashboard();
	setRecentRuns();
	setView();
	setDashboardele();
	setRecent();
	
	
	}
	public String getRecent() {
		return recent;
	}
	public void setRecent() {
		recent =property.getProperty("loc.recent");
	}
	public String getDashboardele() {
		return dashboardele;
	}
	public void setDashboardele() {
		dashboardele =property.getProperty("loc.dashele");
	}
	public String getView() {
		return view;
	}
	public void setView() {
	view =property.getProperty("loc.view");
	
	}
	public String getRecentRuns() {
		return recentRuns;
	}
	public void setRecentRuns() {
		recentRuns =property.getProperty("loc.recentruns");
	}
	public String getDashboard() {
		return dashboard;
	}
	public void setDashboard() {
		dashboard = property.getProperty("loc.dashboard");
	}
	
	

	
	}

