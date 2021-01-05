package sample.springapp.commands;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(CommandType.ADD_)
public class Add implements CommandInterface{
    @Override
    public String execute() {
        //can be delegated to receivers.
        return "Add invoked";
    }
}
