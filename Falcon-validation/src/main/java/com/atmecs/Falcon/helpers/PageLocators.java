package com.atmecs.Falcon.helpers;

import java.util.Properties;

import com.atmecs.Falcon.constants.FilePaths;
import com.atmecs.Falcon.utils.ReadProperties;

public class PageLocators {

	Properties property;
	Properties property_valid;
	public String dashboard;
	public String recentRuns;
	public String view;
	public String dashtitle;
	public String recenttitle;
	public String restimage;
	public String resttext;
	public String valrest;
	public String tooltip_dashboard;
	public String valtooltip_dash;
	public String restapitable;
	

	public void data() throws Exception {

		property = ReadProperties.loadProperty(FilePaths.LOGIN);

		dashboard = property.getProperty("loc.dashboard");
		recentRuns = property.getProperty("loc.recentruns");
		view = property.getProperty("loc.view");
		dashtitle = property.getProperty("loc.dashele");
		recenttitle = property.getProperty("loc.recent");
		restimage = property.getProperty("loc.restimage");
		resttext = property.getProperty("loc.resttext");
		tooltip_dashboard = property.getProperty("loc_tooltip_dashboard");
		restapitable=property.getProperty("loc.restapitable");

	}

	public void getValidationData() throws Exception {
		property_valid = ReadProperties.loadProperty(FilePaths.VALIDATION);
		valrest = property_valid.getProperty("val.rest");
		valtooltip_dash=property_valid.getProperty("val.tooltip_dash");
	}

}
