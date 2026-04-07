package project.springSystemWallet.service;

import org.springframework.stereotype.Service;
import project.springSystemWallet.dto.WalletResponseDto;
import project.springSystemWallet.entity.Wallet;
import project.springSystemWallet.repository.WalletRepository;
import project.springSystemWallet.dto.WalletRequestDto;

import java.util.Optional;
import java.util.UUID;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public WalletResponseDto createWallet(String owner) {
        Wallet newWallet = new Wallet();
        newWallet.setUuid(UUID.randomUUID());
        newWallet.setOwner(owner);
        newWallet.setBalance(0L);

        Wallet savedWallet = walletRepository.save(newWallet);

        return new WalletResponseDto(
                savedWallet.getUuid(),
                savedWallet.getOwner(),
                savedWallet.getBalance()
        );
    }

    public WalletResponseDto getWallet(String owner) {
        Wallet wallet = walletRepository.findByOwner(owner)
                .orElseThrow(() -> new RuntimeException("Кошелек владельца " + owner + " не найден"));

        return new WalletResponseDto(
                wallet.getUuid(),
                wallet.getOwner(),
                wallet.getBalance()
        );
    }

    public Long getBalanceWallet(UUID walletId) {
        if (walletId.equals(walletRepository.findById(walletId))) {
            return getBalanceWallet(walletId);
        }
        return 0L;
    }


}
