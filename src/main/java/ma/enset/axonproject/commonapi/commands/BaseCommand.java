package ma.enset.axonproject.commonapi.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
public abstract class BaseCommand<T> {
    // l'identifiant de l'aggrégat
    @TargetAggregateIdentifier
    private T id;

    public BaseCommand(T id){
        this.id = id;

    }


}
