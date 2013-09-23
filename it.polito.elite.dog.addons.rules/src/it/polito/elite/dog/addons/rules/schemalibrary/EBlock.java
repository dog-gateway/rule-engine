/*
 * Dog - Addons
 * 
 * Copyright (c) 2011 Dario Bonino, Luigi De Russis and Emiliano Castellina
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.07 at 11:46:33 AM CET 
//


package it.polito.elite.dog.addons.rules.schemalibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="notification" type="{http://elite.polito.it/domotics/dog/rules/rule_definition}notificationType"/>
 *         &lt;element name="timeInstant" type="{http://elite.polito.it/domotics/dog/rules/rule_definition}recurringInstant"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBlock", propOrder = {
    "notification",
    "timeInstant"
})
public class EBlock {

    protected NotificationType notification;
    protected RecurringInstant timeInstant;

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotification(NotificationType value) {
        this.notification = value;
    }

    /**
     * Gets the value of the timeInstant property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInstant }
     *     
     */
    public RecurringInstant getTimeInstant() {
        return timeInstant;
    }

    /**
     * Sets the value of the timeInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInstant }
     *     
     */
    public void setTimeInstant(RecurringInstant value) {
        this.timeInstant = value;
    }

}
