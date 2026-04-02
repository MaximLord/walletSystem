package project.springSystemWallet.requestDto;

import lombok.*;
import project.springSystemWallet.entity.OperationType;

import java.util.UUID;

@Data
@Setter
@Getter
public class WalletRequestDto {
    private UUID uuid;
    private OperationType operationType;
    private Long balance;
}
