package finance.control.entities;

import finance.control.enums.Bank;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="bank_portfolio")
public class BankPortfolioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private UserEntity user;

    Bank bank;
}
