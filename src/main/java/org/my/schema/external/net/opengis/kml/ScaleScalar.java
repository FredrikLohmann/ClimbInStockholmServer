//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.17 at 01:29:23 PM CEST 
//


package org.my.schema.external.net.opengis.kml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ScaleScalar
    extends JAXBElement<Double>
{

    protected final static QName NAME = new QName("http://www.opengis.net/kml/2.2", "scale");

    public ScaleScalar(Double value) {
        super(NAME, ((Class) Double.class), null, value);
    }

    public ScaleScalar() {
        super(NAME, ((Class) Double.class), null, null);
    }

}
