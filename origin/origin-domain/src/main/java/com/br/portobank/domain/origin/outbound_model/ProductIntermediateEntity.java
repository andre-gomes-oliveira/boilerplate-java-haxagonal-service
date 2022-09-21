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
@Table(name = "CPFR_CANAL_PRODUTO_SUBPRODUTO")
public class ProductIntermediateEntity {
    @Id
    @Column(name = "COD_CANAL", nullable = false)
    private Integer channelCode;

    @Column(name = "DAT_INICIO_VIGENCIA_CANAL", nullable = false)
    private Date channelEffectiveDateStart;

    @Column(name = "COD_PRODUTO", nullable = false)
    private Integer productCode;

    @Column(name = "DAT_INICIO_VIGENCIA_PRODUTO", nullable = false)
    private Date productEffectiveDateStart;

    @Column(name = "COD_SUBPRODUTO", nullable = false)
    private Integer subproductCode;

    @Column(name = "DAT_INICIO_VIGENCIA_SUBPRODUTO", nullable = false)
    private Date subproductEffectiveDateStart;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;

    @Column(name = "VLR_DESCONTO_OFERTA")
    private Integer discountValue;
}
