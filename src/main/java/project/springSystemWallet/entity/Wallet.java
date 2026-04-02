package project.springSystemWallet.entity;

import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Data
@Setter
@Getter
@Table(name = "wallet")
public class Wallet {
    @Id
    private UUID uuid = UUID.randomUUID();

    private String firstName;

    private Long balance = 0L;
}
