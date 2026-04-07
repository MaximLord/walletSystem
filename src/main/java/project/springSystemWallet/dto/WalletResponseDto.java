package project.springSystemWallet.dto;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletResponseDto {
    private UUID uuid;
    private String owner;
    private Long balance;
}
