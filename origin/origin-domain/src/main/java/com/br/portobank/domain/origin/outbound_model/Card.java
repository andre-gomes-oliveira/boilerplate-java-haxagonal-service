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
@Table(name = "CPFK_SUBPRODUTO_CARTAO")
public class Card {
    @Id
    @Column(name = "COD_SUBPRODUTO", nullable = false)
    private Integer id;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_INICIO_VIGENCIA_SUBPRODUTO", nullable = false)
    private Date subproductEffectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;

    @Column(name = "COD_LOGO", nullable = false)
    private Integer codeLogo;

    @Column(name = "COD_TIPO_PLASTICO", nullable = false)
    private Integer codePlastic;

    @Column(name = "COD_ACAO_EMBOSSAMENTO", nullable = false)
    private Integer codeEmbossing;

    @Column(name = "COD_PCT", nullable = false)
    private Integer codePCT;

    @Column(name = "FLG_EXTRATO", nullable = false)
    private String flagExtract = "N";
}