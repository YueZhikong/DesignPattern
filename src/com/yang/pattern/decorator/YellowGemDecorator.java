package com.yang.pattern.decorator;


/**
 * 黄宝石装饰品
 * 每颗攻击力+10
 */
public class YellowGemDecorator implements IEquipDecorator
{
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }

    @Override
    public int calculateAttack()
    {
        return 10 + equip.calculateAttack();
    }

    @Override
    public String description()
    {
        return equip.description() + "+ 黄宝石";
    }

}