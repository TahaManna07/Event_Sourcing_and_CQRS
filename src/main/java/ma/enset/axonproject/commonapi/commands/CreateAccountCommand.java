package ma.enset.axonproject.commonapi.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountCommand extends BaseCommand<String>{

    private Double initialBalance;
    private String currency;


    public CreateAccountCommand(String id,Double initialBalance,String currency) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }
}
