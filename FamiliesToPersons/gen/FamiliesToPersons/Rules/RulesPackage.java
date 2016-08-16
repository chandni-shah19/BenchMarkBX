/**
 */
package FamiliesToPersons.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FamiliesToPersons.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/FamiliesToPersons/model/FamiliesToPersons.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = FamiliesToPersons.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.FatherToMaleImpl <em>Father To Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.FatherToMaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getFatherToMale()
	 * @generated
	 */
	int FATHER_TO_MALE = 0;

	/**
	 * The number of structural features of the '<em>Father To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_SOLVE_CSP_CC__MALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___CHECK_DEC_BWD__MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Father To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_TO_MALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.ExistingFamily2PersonImpl <em>Existing Family2 Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.ExistingFamily2PersonImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getExistingFamily2Person()
	 * @generated
	 */
	int EXISTING_FAMILY2_PERSON = 1;

	/**
	 * The number of structural features of the '<em>Existing Family2 Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_FAMILY2_PERSON_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existing Family2 Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_FAMILY2_PERSON_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.DaughterOfExistingFamilyToFemaleImpl <em>Daughter Of Existing Family To Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.DaughterOfExistingFamilyToFemaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getDaughterOfExistingFamilyToFemale()
	 * @generated
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE = 2;

	/**
	 * The number of structural features of the '<em>Daughter Of Existing Family To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__FEMALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Daughter Of Existing Family To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_OF_EXISTING_FAMILY_TO_FEMALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.SonOfExistingFamilyToMaleImpl <em>Son Of Existing Family To Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.SonOfExistingFamilyToMaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getSonOfExistingFamilyToMale()
	 * @generated
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE = 3;

	/**
	 * The number of structural features of the '<em>Son Of Existing Family To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_34__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_CC__MALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___CHECK_DEC_BWD__MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Son Of Existing Family To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_OF_EXISTING_FAMILY_TO_MALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.MotherOfExistingFamilyToFemaleImpl <em>Mother Of Existing Family To Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.MotherOfExistingFamilyToFemaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getMotherOfExistingFamilyToFemale()
	 * @generated
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE = 4;

	/**
	 * The number of structural features of the '<em>Mother Of Existing Family To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_35__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__FEMALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Mother Of Existing Family To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_OF_EXISTING_FAMILY_TO_FEMALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.FamilyMember2PersonImpl <em>Family Member2 Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.FamilyMember2PersonImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getFamilyMember2Person()
	 * @generated
	 */
	int FAMILY_MEMBER2_PERSON = 5;

	/**
	 * The number of structural features of the '<em>Family Member2 Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER2_PERSON_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Family Member2 Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER2_PERSON_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.SonToMaleImpl <em>Son To Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.SonToMaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getSonToMale()
	 * @generated
	 */
	int SON_TO_MALE = 6;

	/**
	 * The number of structural features of the '<em>Son To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_SOLVE_CSP_CC__MALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___CHECK_DEC_BWD__MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Son To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SON_TO_MALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.DaughterToFemaleImpl <em>Daughter To Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.DaughterToFemaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getDaughterToFemale()
	 * @generated
	 */
	int DAUGHTER_TO_FEMALE = 7;

	/**
	 * The number of structural features of the '<em>Daughter To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__FEMALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Daughter To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAUGHTER_TO_FEMALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.MotherToFemaleImpl <em>Mother To Female</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.MotherToFemaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getMotherToFemale()
	 * @generated
	 */
	int MOTHER_TO_FEMALE = 8;

	/**
	 * The number of structural features of the '<em>Mother To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FEMALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_SOLVE_CSP_CC__FEMALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___CHECK_DEC_BWD__FEMALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Mother To Female</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_TO_FEMALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.FatherOfExistingFamilyToMaleImpl <em>Father Of Existing Family To Male</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.FatherOfExistingFamilyToMaleImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getFatherOfExistingFamilyToMale()
	 * @generated
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE = 9;

	/**
	 * The number of structural features of the '<em>Father Of Existing Family To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MALE_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_39__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_SOLVE_CSP_CC__MALE_PERSONS_FAMILY_FAMILYMEMBER_FAMILIES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_DEC_FWD__FAMILY_FAMILYMEMBER_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___CHECK_DEC_BWD__MALE_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL__RULEENTRYCONTAINER_FAMILIESTOPERSONSCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FAMILIESTOPERSONSCORR_PERSONS_FAMILY_FAMILIES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Father Of Existing Family To Male</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_OF_EXISTING_FAMILY_TO_MALE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link FamiliesToPersons.Rules.impl.Families2PersonsImpl <em>Families2 Persons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesToPersons.Rules.impl.Families2PersonsImpl
	 * @see FamiliesToPersons.Rules.impl.RulesPackageImpl#getFamilies2Persons()
	 * @generated
	 */
	int FAMILIES2_PERSONS = 10;

	/**
	 * The number of structural features of the '<em>Families2 Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_FWD__MATCH_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_BWD__MATCH_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Families 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_FWD_FAMILIES_4__FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Persons 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPROPRIATE_BWD_PERSONS_4__PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_SOLVE_CSP_CC__FAMILIES_PERSONS_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_DEC_FWD__FAMILIES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___CHECK_DEC_BWD__PERSONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Families2 Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIES2_PERSONS_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.FatherToMale <em>Father To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Father To Male</em>'.
	 * @see FamiliesToPersons.Rules.FatherToMale
	 * @generated
	 */
	EClass getFatherToMale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFatherToMale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFatherToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFatherToMale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFatherToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isAppropriate_BWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isAppropriate_BWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFatherToMale__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFatherToMale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFatherToMale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_solveCsp_CC__Male_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherToMale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherToMale__CheckDEC_BWD__Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getFatherToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFatherToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherToMale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.ExistingFamily2Person <em>Existing Family2 Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existing Family2 Person</em>'.
	 * @see FamiliesToPersons.Rules.ExistingFamily2Person
	 * @generated
	 */
	EClass getExistingFamily2Person();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale <em>Daughter Of Existing Family To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daughter Of Existing Family To Female</em>'.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale
	 * @generated
	 */
	EClass getDaughterOfExistingFamilyToFemale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Family_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_FWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 33</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_FWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_BWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isAppropriate_BWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_solveCsp_CC__Female_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__CheckDEC_BWD__Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterOfExistingFamilyToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterOfExistingFamilyToFemale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale <em>Son Of Existing Family To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Son Of Existing Family To Male</em>'.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale
	 * @generated
	 */
	EClass getSonOfExistingFamilyToMale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Family_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_FWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 34</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_FWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_BWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isAppropriate_BWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_solveCsp_CC__Male_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__CheckDEC_BWD__Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonOfExistingFamilyToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonOfExistingFamilyToMale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale <em>Mother Of Existing Family To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mother Of Existing Family To Female</em>'.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale
	 * @generated
	 */
	EClass getMotherOfExistingFamilyToFemale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Family_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_FWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 35</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_FWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_BWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isAppropriate_BWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_solveCsp_CC__Female_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__CheckDEC_BWD__Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherOfExistingFamilyToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherOfExistingFamilyToFemale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.FamilyMember2Person <em>Family Member2 Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Member2 Person</em>'.
	 * @see FamiliesToPersons.Rules.FamilyMember2Person
	 * @generated
	 */
	EClass getFamilyMember2Person();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.SonToMale <em>Son To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Son To Male</em>'.
	 * @see FamiliesToPersons.Rules.SonToMale
	 * @generated
	 */
	EClass getSonToMale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSonToMale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSonToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSonToMale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSonToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_FWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 36</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_FWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isAppropriate_BWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isAppropriate_BWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSonToMale__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSonToMale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSonToMale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_solveCsp_CC__Male_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getSonToMale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getSonToMale__CheckDEC_BWD__Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getSonToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSonToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.SonToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.SonToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSonToMale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.DaughterToFemale <em>Daughter To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daughter To Female</em>'.
	 * @see FamiliesToPersons.Rules.DaughterToFemale
	 * @generated
	 */
	EClass getDaughterToFemale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDaughterToFemale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDaughterToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getDaughterToFemale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDaughterToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_FWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 37</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_FWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_BWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isAppropriate_BWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_solveCsp_CC__Female_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getDaughterToFemale__CheckDEC_BWD__Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getDaughterToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getDaughterToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.DaughterToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.DaughterToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getDaughterToFemale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.MotherToFemale <em>Mother To Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mother To Female</em>'.
	 * @see FamiliesToPersons.Rules.MotherToFemale
	 * @generated
	 */
	EClass getMotherToFemale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMotherToFemale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMotherToFemale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getMotherToFemale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherToFemale__RegisterObjectsToMatch_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_solveCsp_BWD__Match_Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Female, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Female_FamiliesToPersonsCorr_Persons_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMotherToFemale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_FWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 38</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_FWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isAppropriate_BWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isAppropriate_BWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getMotherToFemale__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_solveCsp_CC(PersonsModel.Female, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_solveCsp_CC__Female_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#checkDEC_BWD(PersonsModel.Female, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getMotherToFemale__CheckDEC_BWD__Female_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getMotherToFemale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getMotherToFemale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.MotherToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.MotherToFemale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getMotherToFemale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale <em>Father Of Existing Family To Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Father Of Existing Family To Male</em>'.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale
	 * @generated
	 */
	EClass getFatherOfExistingFamilyToMale();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__RegisterObjectsToMatch_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_solveCsp_FWD__Match_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_FWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__RegisterObjectsToMatch_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_solveCsp_BWD__Match_Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Male, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_BWD__IsApplicableMatch_Male_FamiliesToPersonsCorr_Persons_Family_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_FWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 39</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_FWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_FWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_BWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isAppropriate_BWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_solveCsp_CC(PersonsModel.Male, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_solveCsp_CC__Male_Persons_Family_FamilyMember_Families_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkDEC_FWD(FamiliesModel.Family, FamiliesModel.FamilyMember, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckDEC_FWD__Family_FamilyMember_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#checkDEC_BWD(PersonsModel.Male, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__CheckDEC_BWD__Male_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, FamiliesToPersons.FamiliesToPersonsCorr)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__GenerateModel__RuleEntryContainer_FamiliesToPersonsCorr();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesToPersons.FamiliesToPersonsCorr, PersonsModel.Persons, FamiliesModel.Family, FamiliesModel.Families, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__GenerateModel_solveCsp_BWD__IsApplicableMatch_FamiliesToPersonsCorr_Persons_Family_Families_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.FatherOfExistingFamilyToMale#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFatherOfExistingFamilyToMale__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link FamiliesToPersons.Rules.Families2Persons <em>Families2 Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Families2 Persons</em>'.
	 * @see FamiliesToPersons.Rules.Families2Persons
	 * @generated
	 */
	EClass getFamilies2Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_FWD__Match_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFamilies2Persons__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__RegisterObjectsToMatch_FWD__Match_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_solveCsp_FWD__Match_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesModel.Families) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_solveCsp_FWD__IsApplicableMatch_Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFamilies2Persons__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_BWD__Match_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getFamilies2Persons__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__RegisterObjectsToMatch_BWD__Match_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_solveCsp_BWD__Match_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Persons) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_solveCsp_BWD__IsApplicableMatch_Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFamilies2Persons__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_FWD_Families_4(FamiliesModel.Families) <em>Is Appropriate FWD Families 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Families 4</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_FWD_Families_4(FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_FWD_Families_4__Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isAppropriate_BWD_Persons_4(PersonsModel.Persons) <em>Is Appropriate BWD Persons 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Persons 4</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isAppropriate_BWD_Persons_4(PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsAppropriate_BWD_Persons_4__Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_CC(FamiliesModel.Families, PersonsModel.Persons, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_solveCsp_CC(FamiliesModel.Families, PersonsModel.Persons, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_solveCsp_CC__Families_Persons_Match_Match();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkDEC_FWD(FamiliesModel.Families) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkDEC_FWD(FamiliesModel.Families)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckDEC_FWD__Families();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#checkDEC_BWD(PersonsModel.Persons) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#checkDEC_BWD(PersonsModel.Persons)
	 * @generated
	 */
	EOperation getFamilies2Persons__CheckDEC_BWD__Persons();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getFamilies2Persons__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getFamilies2Persons__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link FamiliesToPersons.Rules.Families2Persons#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see FamiliesToPersons.Rules.Families2Persons#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getFamilies2Persons__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
