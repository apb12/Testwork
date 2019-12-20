package com.alekseev.Service;

import org.springframework.stereotype.Service;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;

@Service
public class ValidationService {
    public static boolean validXml(String xml, String xsdPath) throws FileNotFoundException {
        InputStream xmlStream = new ByteArrayInputStream(xml.getBytes());
        File xsd = new File(xsdPath);
        InputStream xsdStream = new FileInputStream(xsd);
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsdStream));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlStream));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}