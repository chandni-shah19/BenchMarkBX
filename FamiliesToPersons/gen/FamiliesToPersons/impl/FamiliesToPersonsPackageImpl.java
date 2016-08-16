/**
 */
package FamiliesToPersons.impl;

import FamiliesModel.FamiliesModelPackage;

import FamiliesToPersons.FamiliesToPersonsFactory;
import FamiliesToPersons.FamiliesToPersonsPackage;

import FamiliesToPersons.Rules.RulesPackage;

import FamiliesToPersons.Rules.impl.RulesPackageImpl;

import PersonsModel.PersonsModelPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamiliesToPersonsPackageImpl extends EPackageImpl implements FamiliesToPersonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "FamiliesToPersons.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberToPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familiesToPersonsCorrEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FamiliesToPersons.FamiliesToPersonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FamiliesToPersonsPackageImpl() {
		super(eNS_URI, FamiliesToPersonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FamiliesToPersonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FamiliesToPersonsPackage init() {
		if (isInited)
			return (FamiliesToPersonsPackage) EPackage.Registry.INSTANCE.getEPackage(FamiliesToPersonsPackage.eNS_URI);

		// Obtain or create and register package
		FamiliesToPersonsPackageImpl theFamiliesToPersonsPackage = (FamiliesToPersonsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FamiliesToPersonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FamiliesToPersonsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FamiliesModelPackage.eINSTANCE.eClass();
		PersonsModelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theFamiliesToPersonsPackage.loadPackage();

		// Fix loaded packages
		theFamiliesToPersonsPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFamiliesToPersonsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FamiliesToPersonsPackage.eNS_URI, theFamiliesToPersonsPackage);
		return theFamiliesToPersonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberToPerson() {
		if (familyMemberToPersonEClass == null) {
			familyMemberToPersonEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(FamiliesToPersonsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return familyMemberToPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberToPerson_Source() {
		return (EReference) getFamilyMemberToPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberToPerson_Target() {
		return (EReference) getFamilyMemberToPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamiliesToPersonsCorr() {
		if (familiesToPersonsCorrEClass == null) {
			familiesToPersonsCorrEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(FamiliesToPersonsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return familiesToPersonsCorrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamiliesToPersonsCorr_Source() {
		return (EReference) getFamiliesToPersonsCorr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamiliesToPersonsCorr_Target() {
		return (EReference) getFamiliesToPersonsCorr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesToPersonsFactory getFamiliesToPersonsFactory() {
		return (FamiliesToPersonsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("FamiliesToPersons." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FamiliesToPersonsPackageImpl
