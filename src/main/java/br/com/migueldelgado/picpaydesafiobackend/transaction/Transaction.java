package br.com.migueldelgado.picpaydesafiobackend.transaction;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table("TRANSACTIONS")
public record Transaction(
        @Id long id,
        Long payer,
        Long payee,
        BigDecimal value,
        @CreatedDate
        LocalDateTime createdAt) {
}

