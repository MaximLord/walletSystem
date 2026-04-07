package project.springSystemWallet.entity;

import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wallets")
public class Wallet {
    @Id
    private UUID uuid;

    private String owner;

    private WalletType type;

    private Long balance;
}
