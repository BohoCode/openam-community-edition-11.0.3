//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * The local system has a private key and uses it for shared secret key agreement with the Authentication Authority (e.g. via Diffie Helman).
 * 
 * Java content class for AsymmetricKeyAgreement element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 334)
 * <p>
 * <pre>
 * &lt;element name="AsymmetricKeyAgreement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface AsymmetricKeyAgreementElement
    extends javax.xml.bind.Element, com.sun.identity.liberty.ws.common.jaxb.ac.AsymmetricKeyAgreementType
{


}