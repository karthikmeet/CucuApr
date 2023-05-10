package org.stepdef;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DatatableSampleStepdef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(DataTable table) {
		List<Map<String, String>> mps = table.asMaps();
		System.out.println(mps);
		System.out.println(mps.get(0));
		System.out.println(mps.get(1));
		System.out.println(mps.get(2));
		System.out.println(mps.get(0).get("Username"));
		System.out.println(mps.get(0).get("Password"));
		System.out.println(mps.get(1).get("Username"));
		System.out.println(mps.get(1).get("Password"));
		System.out.println(mps.get(2).get("Username"));
		System.out.println(mps.get(2).get("Password"));
	}

	@When("I complete action")
	public void i_complete_action() {
		// System.out.println("When");
	}

	@Then("I validate the outcomesdatatable")
	public void i_validate_the_outcomes() {
		// System.out.println("Then");
	}
}

// AS LIST
//List<String> ls = table.asList();
//System.out.println(ls.get(0));
//System.out.println(ls.get(1));
//System.out.println(ls);

// AS LISTS
//List<List<String>> lss = table.asLists();
//System.out.println(lss);
//System.out.println(lss.get(0));
//System.out.println(lss.get(0).get(0));

// AS MAP
//Map<Integer, String> mp = table.asMap(Integer.class, String.class);
//System.out.println(mp);
//System.out.println(mp.get(5));
//System.out.println(mp.get(8));
//System.out.println(mp.get(6));

// AS MAPS
//List<Map<String, String>> mps = table.asMaps();
//System.out.println(mps);
//System.out.println(mps.get(0));
//System.out.println(mps.get(1));
//System.out.println(mps.get(2));
//System.out.println(mps.get(0).get("Username"));
//System.out.println(mps.get(0).get("Password"));
//System.out.println(mps.get(1).get("Username"));
//System.out.println(mps.get(1).get("Password"));
//System.out.println(mps.get(2).get("Username"));
//System.out.println(mps.get(2).get("Password"));
