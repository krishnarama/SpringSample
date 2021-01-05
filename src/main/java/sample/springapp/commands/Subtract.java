package sample.springapp.commands;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(CommandType.SUBTRACT_)
public class Subtract implements CommandInterface {
    @Override
    public String execute() {
        //can be delegated to receivers.
        return "Subtract invoked";
    }
}
