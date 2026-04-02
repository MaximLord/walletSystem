package project.springSystemWallet.service;

import org.springframework.stereotype.Service;
import project.springSystemWallet.entity.Wallet;
import project.springSystemWallet.repository.WalletRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public void createWallet(String firstName) {
        Wallet newWallet = new Wallet();
        walletRepository.save(newWallet);
    }

    public Optional<Wallet> getWallet(UUID uuid) {
        return walletRepository.findById(uuid);
    }

    public Long getBalanceWallet(UUID walletId) {
        if(walletId.equals(walletRepository.findById(walletId))){
            return getBalanceWallet(walletId);
        }
        return 0L;
    }


}
