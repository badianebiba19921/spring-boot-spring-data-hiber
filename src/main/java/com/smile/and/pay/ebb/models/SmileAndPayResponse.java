package com.smile.and.pay.ebb.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Data
@XmlRootElement
/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smileAndPayResponse", propOrder = { "codeRetour", "messageRetour" })*/
public class SmileAndPayResponse implements Serializable {

    String codeRetour;
    String messageRetour;

    public SmileAndPayResponse setCodeRetour(String codeRetour) {
        this.codeRetour = codeRetour;
        return this;
    }

    public SmileAndPayResponse setMessageRetour(String messageRetour) {
        this.messageRetour = messageRetour;
        return this;
    }
}
