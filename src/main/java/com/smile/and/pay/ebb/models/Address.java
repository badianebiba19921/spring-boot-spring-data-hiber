package com.smile.and.pay.ebb.models;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Data
@Entity
@Table(name = "addresses")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = { "id", "number", "street", "zip_code", "marchand" })
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int number;
    private String street;
    private String zip_code;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name="id_marchand" )
    private Marchand marchand;
}
