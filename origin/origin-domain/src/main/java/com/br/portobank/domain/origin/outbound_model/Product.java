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
@Table(name = "CPFK_PRODUTO")
public class Product {
    @Id
    @Column(name = "COD_PRODUTO", nullable = false)
    private Integer id;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;

    @Column(name = "NOM_PRODUTO", nullable = false)
    private String productName;

    @Column(name = "FLG_ATUALIZA_BCP", nullable = false)
    private String shouldUpdateBCP;

    @Column(name = "FLG_ATUALIZA_BCC", nullable = false)
    private String shouldUpdateBcc;
}