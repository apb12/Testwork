package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class XmlToObjectService {
    public static Purchase convert(String xml) throws IOException {
        XmlMapper xmlMapper=new XmlMapper();
        return xmlMapper.readValue(xml,Purchase.class);
    }
}
