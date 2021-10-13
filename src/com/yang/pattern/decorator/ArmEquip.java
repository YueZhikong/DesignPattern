package com.yang.pattern.decorator;


/**
 * 武器
 * 攻击力20
 *
 */
public class ArmEquip implements IEquip
{

    @Override
    public int calculateAttack()
    {
        return 20;
    }

    @Override
    public String description()
    {
        return "屠龙刀";
    }

}