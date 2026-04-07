package project.springSystemWallet.dto;

import lombok.*;
import project.springSystemWallet.entity.OperationType;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletRequestDto {
    private UUID id;
    private OperationType operationType;
    private Long amount;
}
