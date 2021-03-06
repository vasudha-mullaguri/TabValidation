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
	public String restapitext;
	public String valrest;
	public String tooltip_dashboard;
	public String valtooltip_dash;
	public String restapitable;
	public String rest_tooltip_bar;
	public String val_rest_tooltip_bar;
	public String rest_tooltip_10;
	public String val_rest_tooltip_10;
	public String rest_tooltip_90;
    public String val_rest_tooltip_90;
    public String val_dashtitle;
    public String val_resttitle;
    public String val_restapitable;
    public String restapi_heading;
    public String val_restapi_heading;
    public String dropdown_customer;
    public String customer_option;
    public String dropdown_module;
    public String module_option;
    public String dropdown_status;
    public String status_option;
    public String dropdown_status_pass;
    public String dropdown_status_fail;
   public String  dropdown_status_skip;
    

	
	public void data() throws Exception {

		property = ReadProperties.loadProperty(FilePaths.LOGIN);

		dashboard = property.getProperty("loc.dashboard");
		recentRuns = property.getProperty("loc.recentruns");
		view = property.getProperty("loc.view");
		dashtitle = property.getProperty("loc.dashele");
		recenttitle = property.getProperty("loc.recent");
		restimage = property.getProperty("loc.restimage");
		restapitext = property.getProperty("loc.restapitext");
		tooltip_dashboard = property.getProperty("loc_tooltip_dashboard");
		restapitable = property.getProperty("loc.restapitable");
		rest_tooltip_bar = property.getProperty("loc.rest_tooltip_bar");
		rest_tooltip_10 = property.getProperty("loc.rest_tooltip_10");
		rest_tooltip_90=property.getProperty("loc.rest_tooltip_90%");
		restapi_heading=property.getProperty("loc.restapi_heading");
		
		dropdown_customer = property.getProperty("loc_dropdown_customer");
		customer_option = property.getProperty("loc_customer_option");
		dropdown_module = property.getProperty("loc_dropdown_module");
		module_option = property.getProperty("loc_module_option");
		dropdown_status = property.getProperty("loc_dropdown_status");
		status_option = property.getProperty("loc_status_option");
		dropdown_status_pass=property.getProperty("loc_dropdown_status_pass");
		dropdown_status_fail=property.getProperty("loc_dropdown_status_fail");
		dropdown_status_skip=property.getProperty("loc_dropdown_status_skip");

	}

	public void getValidationData() throws Exception {
		property_valid = ReadProperties.loadProperty(FilePaths.VALIDATION);
		valrest = property_valid.getProperty("val.rest");
		valtooltip_dash = property_valid.getProperty("val.tooltip_dash");
		val_rest_tooltip_bar = property_valid.getProperty("val.rest_tooltip_bar");
		val_rest_tooltip_10 = property_valid.getProperty("val.rest_tooltip_10");
		val_rest_tooltip_90=property_valid.getProperty("val.rest_tooltip_90%");
		val_dashtitle=property_valid.getProperty("val.dashtitle");
		val_resttitle=property_valid.getProperty("val.resttitle");
		val_restapitable=property_valid.getProperty("val.resttable");
		val_restapi_heading=property_valid.getProperty("val.restapi_heading");
	}

}
