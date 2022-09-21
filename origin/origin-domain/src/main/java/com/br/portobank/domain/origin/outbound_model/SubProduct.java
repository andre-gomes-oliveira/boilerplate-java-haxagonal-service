package com.br.portobank.domain.origin.outbound_model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "CPFK_SUBPRODUTO")
public class SubProduct {
    @Id
    @Column(name = "COD_SUBPRODUTO", nullable = false)
    private Integer id;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;

    @Column(name = "NOM_SUBPRODUTO", nullable = false)
    private String subProductName;
}