package com.mike_milk.mvp.ToastUtil;

import android.content.Context;
import android.widget.Switch;
import android.widget.Toast;

/**
 * 时间：2020/3/19
 * 创建者：MIKE-MILK
 * 描述：一个简单的吐司工具类
 */
public class ToastUtil {
    private static Toast toast;
    //设置开关当值为1时执行
    private static int Switch=1;

    public static void shortToast(Context context, String content){
        if (toast!=null){
            toast.cancel();
        }else if (Switch==1){
            Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
        }
    }

    public static void longToast(Context context,String content){
        if (toast!=null){
            toast.cancel();
        }else if (Switch==1){
            Toast.makeText(context,content,Toast.LENGTH_LONG).show();
        }
    }

    public static void show(Context context,String content){
        if (toast==null){
            toast=Toast.makeText(context,content,Toast.LENGTH_LONG);
        }else {
            toast.setText(content);
        }
        toast.show();
    }
}
