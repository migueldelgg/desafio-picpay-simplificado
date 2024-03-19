package br.com.migueldelgado.picpaydesafiobackend.wallet;

import org.springframework.data.repository.ListCrudRepository;

public interface WalletRepository extends ListCrudRepository<Wallet, Long> {
}
