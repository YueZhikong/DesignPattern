package com.yang.pattern.factory.a;

import com.yang.pattern.factory.b.Meat;
import com.yang.pattern.factory.b.RouJiaMoYLFactory;
import com.yang.pattern.factory.b.YuanLiao;

public abstract class RouJiaMo
{
    public String name;

    /**
     * 准备工作
     */
    public void prepare()
    {
        System.out.println("揉面-剁肉-完成准备工作");
    }


    public final void prepare(RouJiaMoYLFactory ylFactory)
    {
        Meat meat = ylFactory.createMeat();
        YuanLiao yuanliao = ylFactory.createYuanliao();
        System.out.println("使用官方的原料" + meat + " , " + yuanliao + "作为原材料制作肉夹馍 ");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack()
    {
        System.out.println("肉夹馍-专用袋-包装");
    }
    /**
     * 秘制设备-烘烤2分钟
     */
    public void fire()
    {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
