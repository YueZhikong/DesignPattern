package com.yang.pattern.factory.b;


/**
 * 提供肉夹馍的原料
 * @author zhy
 *
 */
public interface RouJiaMoYLFactory
{
    /**
     * 生产肉
     * @return
     */
    public Meat createMeat();

    /**
     * 生产调料神马的
     * @return
     */
    public YuanLiao createYuanliao();

}