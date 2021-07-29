package br.com.zupacademy.giovannimoratto.proposta.cartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author giovanni.moratto
 */

@Repository
public interface CartaoRepository extends JpaRepository <CartaoModel, Long> {

}
