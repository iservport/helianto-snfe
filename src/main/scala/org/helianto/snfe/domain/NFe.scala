package org.helianto.snfe.domain

/**
 * Tipo Nota Fiscal Eletrônica.
 *
 * Created by mauriciofernandesdecastro on 05/09/15.
 */
case class NFe(ide: NFeIde
               , emit: NFeEmit
               , avulsa:NFeAvulsa
               , dest: NFeDest
               , retirada: NFeRetirada
               , entrega: NFeEntrega
               , autXML: NFeAutXML
               , det: NFeDet
               , total: NFeTotal
               , transp: NFeTransp
               , cobr: NFeCobr
               , pag: NFePag
               , infAdic: NFeInfAdic
               , exporta: NFeExporta
               , compra: NFeCompra) {}
