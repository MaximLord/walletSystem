package project.springSystemWallet.controller;

import org.springframework.web.bind.annotation.*;
import project.springSystemWallet.entity.Wallet;
import project.springSystemWallet.service.WalletService;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    //{"firstName": "Maxim"}
    @PostMapping("/wallets/create")
    public void createWallet(String name) {
        walletService.createWallet(name);
    }

    @GetMapping("/wallets/{walletId}")
    public Optional<Wallet> getWalletId(@PathVariable String name) {
        return walletService.getWallet(name);
    }

    @GetMapping("/wallets/{walletBalanceId}")
    public Long getWalletBalance(@PathVariable UUID uuid) {
        return walletService.getBalanceWallet(uuid);
    }
}
