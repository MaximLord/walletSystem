package project.springSystemWallet.controller;

import org.springframework.web.bind.annotation.*;
import project.springSystemWallet.dto.WalletRequestDto;
import project.springSystemWallet.dto.WalletResponseDto;
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

    //{"owner": "Maxim"}
    @PostMapping("/wallets/create")
    public WalletResponseDto createWallet(@RequestBody WalletResponseDto owner) {
        return walletService.createWallet(owner.getOwner());
    }


    @GetMapping("/wallets/getOwner/{owner}")
    public WalletResponseDto getWallet(@PathVariable String owner) {
        return walletService.getWallet(owner);
    }

    @GetMapping("/wallets/getBalance/{uuid}")
    public Long getWalletBalance(@PathVariable UUID uuid) {
        return walletService.getBalanceWallet(uuid);
    }
}
