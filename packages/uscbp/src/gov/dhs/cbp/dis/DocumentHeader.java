/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elements that are used to identify/locate a unique document submission.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentID <em>Document ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentLabel <em>Document Label</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getCompleteFileName <em>Complete File Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getFileExtensionType <em>File Extension Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentDescription <em>Document Description</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentSentDate <em>Document Sent Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentHeader#getDocPreviouslySubmitted <em>Doc Previously Submitted</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader()
 * @model extendedMetaData="name='DocumentHeader' kind='elementOnly'"
 * @generated
 */
public interface DocumentHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required - Generated by the sending system for traceability. Should be UniqueID within the sending system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document ID</em>' attribute.
	 * @see #setDocumentID(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_DocumentID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentID();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentID <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document ID</em>' attribute.
	 * @see #getDocumentID()
	 * @generated
	 */
	void setDocumentID(String value);

	/**
	 * Returns the value of the '<em><b>Document Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required - Form-Label of the submitted Document. Ex CBP Form 301.
	 * 					    NOTE: Please see the DIS Implementation guide for the current list of supported values for this field.  
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Label</em>' attribute.
	 * @see #setDocumentLabel(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_DocumentLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DocumentLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentLabel();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentLabel <em>Document Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Label</em>' attribute.
	 * @see #getDocumentLabel()
	 * @generated
	 */
	void setDocumentLabel(String value);

	/**
	 * Returns the value of the '<em><b>Complete File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complete File Name (example filename.pdf).  EXCLUSIONS for constructing filename are the following; DO NOT USE Apostrophe, /, \ , %, ampersand within filename and spaces before or after file name, double spaces within name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete File Name</em>' attribute.
	 * @see #setCompleteFileName(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_CompleteFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CompleteFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompleteFileName();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getCompleteFileName <em>Complete File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete File Name</em>' attribute.
	 * @see #getCompleteFileName()
	 * @generated
	 */
	void setCompleteFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Extension Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File Extension Type PDF;DOCX etc 
	 * 					    NOTE: Please see the DIS Implementation guide for the current list of supported values for this field.  
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Extension Type</em>' attribute.
	 * @see #setFileExtensionType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_FileExtensionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FileExtensionType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileExtensionType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getFileExtensionType <em>File Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension Type</em>' attribute.
	 * @see #getFileExtensionType()
	 * @generated
	 */
	void setFileExtensionType(String value);

	/**
	 * Returns the value of the '<em><b>Document Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free Form description of document if needed 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Description</em>' attribute.
	 * @see #setDocumentDescription(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_DocumentDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DocumentDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentDescription();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentDescription <em>Document Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Description</em>' attribute.
	 * @see #getDocumentDescription()
	 * @generated
	 */
	void setDocumentDescription(String value);

	/**
	 * Returns the value of the '<em><b>Document Sent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and Time when the document was sent to CBP if known. EST Format 2010-05-25T00:34:47.0Z 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Sent Date</em>' attribute.
	 * @see #setDocumentSentDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_DocumentSentDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='DocumentSentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDocumentSentDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentSentDate <em>Document Sent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Sent Date</em>' attribute.
	 * @see #getDocumentSentDate()
	 * @generated
	 */
	void setDocumentSentDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Doc Previously Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y or N. Use Y to indicate that the document was previously submitted to CBP, and that this transaction should refer to. 
	 * 					        NOTE: DocumentName will be used to refer to the on-file document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Previously Submitted</em>' attribute.
	 * @see #setDocPreviouslySubmitted(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentHeader_DocPreviouslySubmitted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DocPreviouslySubmitted' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocPreviouslySubmitted();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentHeader#getDocPreviouslySubmitted <em>Doc Previously Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Previously Submitted</em>' attribute.
	 * @see #getDocPreviouslySubmitted()
	 * @generated
	 */
	void setDocPreviouslySubmitted(String value);

} // DocumentHeader