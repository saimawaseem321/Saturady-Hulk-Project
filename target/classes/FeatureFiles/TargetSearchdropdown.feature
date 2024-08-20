@regression @smoke @us-240
Feature: Target Search for Deals Functionality

Description: User should able to Select items from Deals Dropdown

	Background: 
		Given Open Target Homepage
	
	Scenario: Target Search for Deals functionality
		Given Search for Deals
		When  Click on Deals button
		And Select Top Deals from Dropdown
         Then topdeals page should displyed
		
		Scenario: Target Search for New & Featured functionality
		Given Search for  New & Featured
		When  Click on  New & Featured
		And Select New arrivals from Dropdown
		Then New arrivals page should displayed
	