package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    private lateinit var criterioAprovacao : CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao){
        criterioAprovacao = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado{
        val mediaFinal = criterioAprovacao.mediaFinal(boletim)
        val foiAprovado = criterioAprovacao.estaAprovado(boletim)

        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, foiAprovado)
    }


}