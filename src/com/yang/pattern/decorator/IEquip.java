package com.yang.pattern.decorator;


/**
 * 装备的接口
 *
 */
public interface IEquip
{

    /**
     * 计算攻击力
     *
     * @return
     */
    public int calculateAttack();

    /**
     * 装备的描述
     *
     * @return
     */
    public String description();
}
