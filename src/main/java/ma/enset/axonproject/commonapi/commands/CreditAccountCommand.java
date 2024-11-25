package ma.enset.axonproject.commonapi.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditAccountCommand extends BaseCommand<String>{

    private Double amount;
    private String currency;


    public CreditAccountCommand(String id, Double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
