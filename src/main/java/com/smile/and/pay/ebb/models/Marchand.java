package com.smile.and.pay.ebb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "marchands")
/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marchand", propOrder = { "id", "create_date", "name", "lastname", "birthdate", "addresses", "products" })*/
public class Marchand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date create_date;
    private String name;
    private String lastname;
    private Date birthdate;

    @OneToMany( targetEntity = Address.class, mappedBy="marchand" )
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany
    @JoinTable( name = "marchands_products",
            joinColumns = @JoinColumn( name = "id_marchand" ),
            inverseJoinColumns = @JoinColumn( name = "id_product" ) )
    private List<Product> products = new ArrayList<>();
}
