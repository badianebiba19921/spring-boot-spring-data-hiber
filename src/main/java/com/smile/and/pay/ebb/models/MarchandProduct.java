package com.smile.and.pay.ebb.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "marchands_products")
/*@AssociationOverrides({
        @AssociationOverride(name = "pk.marchands", joinColumns = @JoinColumn(name = "id_marchand")),
        @AssociationOverride(name = "pk.products", joinColumns = @JoinColumn(name = "id_product")) })*/
public class MarchandProduct implements Serializable {

    private Date joinedDate;
}
