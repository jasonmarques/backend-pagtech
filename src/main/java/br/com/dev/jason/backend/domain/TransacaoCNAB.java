package br.com.dev.jason.backend.domain;

import java.math.BigDecimal;

public record TransacaoCNAB(
                Integer tipo,
                String data,
                BigDecimal valor,
                Long cpf,
                String cartao,
                String hora,
                String donoDaLoja,
                String nomeDaLoja) {

}