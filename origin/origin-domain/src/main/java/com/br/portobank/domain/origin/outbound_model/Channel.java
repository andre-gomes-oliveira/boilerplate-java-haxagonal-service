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
@Table(name = "CPFK_CANAL")
public class Channel {
    @Id
    @Column(name = "COD_CANAL", nullable = false)
    private Integer id;

    @Column(name = "DAT_INICIO_VIGENCIA", nullable = false)
    private Date effectiveDataStart;

    @Column(name = "DAT_FIM_VIGENCIA")
    private Date effectiveDataEnd;

    @Column(name = "NOM_CANAL", nullable = false)
    private Date channelName;

    @Column(name = "QTD_HORA_VALIDADE", nullable = false)
    private Integer validHours;

    @Column(name = "FLG_VALOR_OBRIGATORIO_OFERTA", nullable = false)
    private String hasValueOffer = "N";
}
