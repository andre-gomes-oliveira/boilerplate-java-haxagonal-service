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
@Table(name = "CPFK_SUBPRODUTO_VENCIMENTO")
public class Expiration {
    @Id
    @Column(name = "COD_SUBPRODUTO", nullable = false)
    private Integer id;

    @Column(name = "DAT_INICIO_VIGENCIA_SUBPRODUTO", nullable = false)
    private Date subproductEffectiveDataStart;

    @Column(name = "NUM_DIA_VENCIMENTO", nullable = false)
    private Integer expirationDay;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;
}