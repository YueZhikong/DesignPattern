package com.yang.pattern.decorator;


/**
 * 护腕
 * 攻击力 5
 *
 */
public class WristEquip implements IEquip
{

    @Override
    public int calculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战护腕";
    }

}