//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.15 at 06:40:31 PM MSK 
//


package by.it.galushka.jd02_09.beans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.it.galushka.jd02_09.beans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.it.galushka.jd02_09.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fighters }
     * 
     */
    public Fighters createFighters() {
        return new Fighters();
    }

    /**
     * Create an instance of {@link Lightweight }
     * 
     */
    public Lightweight createLightweight() {
        return new Lightweight();
    }

    /**
     * Create an instance of {@link Middleweight }
     * 
     */
    public Middleweight createMiddleweight() {
        return new Middleweight();
    }

    /**
     * Create an instance of {@link Fighter }
     * 
     */
    public Fighter createFighter() {
        return new Fighter();
    }

    /**
     * Create an instance of {@link Events }
     * 
     */
    public Events createEvents() {
        return new Events();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

}
