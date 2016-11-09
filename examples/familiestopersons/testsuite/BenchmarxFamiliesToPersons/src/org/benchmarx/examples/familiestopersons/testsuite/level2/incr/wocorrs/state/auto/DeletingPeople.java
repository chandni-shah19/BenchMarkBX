package org.benchmarx.examples.familiestopersons.testsuite.level2.incr.wocorrs.state.auto;

import org.benchmarx.BXTool;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCase;
import org.junit.Test;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class DeletingPeople extends FamiliesToPersonsTestCase {
	
	public DeletingPeople(BXTool<FamilyRegister, PersonRegister, Decisions> tool) {
		super(tool);
	}

	/**
	 * <b>Test</b> for deleting a person.
	 * <p>
	 * <b>Expect</b> the deletion of the corresponding family member in the families model.
	 * <p>
	 * <b>Classification</b>: incr-wocorr-state-auto
	 * <ul>
	 * <li><b>incr</b>: deleting person requires old consistent state as 
	 * the information if females are daughters or mothers (and males analogously) would otherwise be lost.
	 * <li><b>wocorr</b>: assumption of unique names can be used here to compute
	 * correspondences correctly.
	 * <li><b>state</b>: deleting is state based, as its possible to determine old and new state.
	 * <li><b>auto</b>: propagation is deterministic so no choice involved.
	 * <ul>
	 */
	@Test
	public void testDeletePerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createSimpsonFamily)
				   							   .andThen(helperFamily::createFatherHomer));
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//---------------------- 
		tool.performAndPropagateTargetEdit(helperPerson::deleteMarge);
		//---------------------- 
		
		util.assertTarget("PersonDelete");
		util.assertSource("MemberDelete");
	}
	
	/**
	 * <b>Test</b> for deleting a person. (here first person is deleted, i.e. which is first created)
	 * <p>
	 * <b>Expect</b> the deletion of the corresponding family member in the families model.
	 * <p>
	 * <b>Classification</b>: Analogous to @link {@link #testDeletePerson()}
	 */
	@Test
	public void testDeleteFirstPerson() {
		tool.initiateSynchronisationDialogue();
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createSimpsonFamily)
											   .andThen(helperFamily::createFatherHomer));
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamilyMembers);
		
		//---------------------- 
		tool.performAndPropagateTargetEdit(helperPerson::deleteHomer);
		//---------------------- 
		
		util.assertTarget("PersonFirstDelete");
		util.assertSource("MemberFirstDelete");
	}
	
}
