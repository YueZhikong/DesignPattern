package com.yang.pattern.decorator;


/**
 * 鞋子
 * 攻击力 5
 *
 */
public class ShoeEquip implements IEquip
{

    @Override
    public int calculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战靴子";
    }

}
