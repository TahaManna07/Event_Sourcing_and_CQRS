package ma.enset.axonproject.commonapi.commands;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebitAccountCommand extends BaseCommand<String>{

    private Double amount;
    private String currency;


    public DebitAccountCommand(String id, Double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
