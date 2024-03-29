package com.yang.pattern.command;

/**
 * 开电脑的命令
 * @author zhy
 *
 */
public class ComputerOnCommand implements Command
{
    private Computer computer ;

    public ComputerOnCommand(Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public void execute()
    {
        computer.on();
    }

}
