package com.yang.pattern.command;


/**
 * 打开电灯的命令
 *
 */
public class LightOnCommand implements Command
{
    private Light light ;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }

}