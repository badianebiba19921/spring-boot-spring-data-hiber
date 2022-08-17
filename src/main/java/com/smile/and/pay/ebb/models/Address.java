package com.smile.and.pay.ebb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
@XmlRootElement
/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = { "id", "number", "street", "zip_code", "marchand" })*/
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int number;
    private String street;
    private String zip_code;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name="id_marchand" )
    private Marchand marchand;
}
