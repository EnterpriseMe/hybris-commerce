//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.28 at 01:41:28 PM CDT 
//


package de.hybris.platform.processengine.definition.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for split complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="split">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetNode" type="{http://www.hybris.de/xsd/processdefinition}targetNode" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hybris.de/xsd/processdefinition}nodeAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "split", propOrder = {
    "targetNode"
})
public class Split {

    @XmlElement(required = true)
    protected List<TargetNode> targetNode;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the targetNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetNode }
     * 
     * 
     */
    public List<TargetNode> getTargetNode() {
        if (targetNode == null) {
            targetNode = new ArrayList<TargetNode>();
        }
        return this.targetNode;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
