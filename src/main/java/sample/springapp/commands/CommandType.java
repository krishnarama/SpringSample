package sample.springapp.commands;

public enum CommandType {
    ADD(CommandType.ADD_),
    SUBTRACT(CommandType.SUBTRACT_);

    public static final String ADD_ = "add";
    public static final String SUBTRACT_ = "subtract";

    private String commandName;

    CommandType(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName(){
        return this.commandName;
    }
}
