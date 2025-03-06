package com.zzhoujay.html;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by zhou on 2018/3/11.
 */

public class Kit {

    private static final HashMap<String, Integer> sColorNameMap;

    static {
        sColorNameMap = new HashMap<>();
        sColorNameMap.put("transparent", 0);
        // 红色系
        sColorNameMap.put("indianred", -3318692);
        sColorNameMap.put("lightcoral", -1015680);
        sColorNameMap.put("salmon", -360334);
        sColorNameMap.put("darksalmon", -765666);
        sColorNameMap.put("lightsalmon", -24454);
        sColorNameMap.put("crimson", -2354116);
        sColorNameMap.put("red", -65536);
        sColorNameMap.put("firebrick", -5103070);
        sColorNameMap.put("darkred", -7667712);

// 粉色系
        sColorNameMap.put("pink", -16181);
        sColorNameMap.put("lightpink", -18751);
        sColorNameMap.put("hotpink", -38476);
        sColorNameMap.put("deeppink", -60269);
        sColorNameMap.put("mediumvioletred", -3730043);
        sColorNameMap.put("palevioletred", -2396013);

// 橙色系
        sColorNameMap.put("coral", -32944);
        sColorNameMap.put("tomato", -40121);
        sColorNameMap.put("orangered", -47872);
        sColorNameMap.put("darkorange", -29696);
        sColorNameMap.put("orange", -23296);

// 黄色系
        sColorNameMap.put("gold", -10496);
        sColorNameMap.put("yellow", -256);
        sColorNameMap.put("lightyellow", -32);
        sColorNameMap.put("lemonchiffon", -1331);
        sColorNameMap.put("lightgoldenrodyellow", -329006);
        sColorNameMap.put("papayawhip", -4139);
        sColorNameMap.put("moccasin", -6987);
        sColorNameMap.put("peachpuff", -9543);
        sColorNameMap.put("palegoldenrod", -1120086);
        sColorNameMap.put("khaki", -989556);
        sColorNameMap.put("darkkhaki", -4343957);

// 紫色系
        sColorNameMap.put("lavender", -663885);
        sColorNameMap.put("thistle", -2572328);
        sColorNameMap.put("plum", -2252579);
        sColorNameMap.put("violet", -1146130);
        sColorNameMap.put("orchid", -2461482);
        sColorNameMap.put("fuchsia", -65281);
        sColorNameMap.put("magenta", -65281);
        sColorNameMap.put("mediumorchid", -4565549);
        sColorNameMap.put("mediumpurple", -7114533);
        sColorNameMap.put("rebeccapurple", -10079335);
        sColorNameMap.put("blueviolet", -7722014);
        sColorNameMap.put("darkviolet", -9134084);
        sColorNameMap.put("darkorchid", -10040065);
        sColorNameMap.put("darkmagenta", -7667573);
        sColorNameMap.put("purple", -8388480);
        sColorNameMap.put("indigo", -11861886);
        sColorNameMap.put("slateblue", -9807155);
        sColorNameMap.put("darkslateblue", -12042869);
        sColorNameMap.put("mediumslateblue", -8689426);

// 绿色系
        sColorNameMap.put("greenyellow", -5374161);
        sColorNameMap.put("chartreuse", -8388864);
        sColorNameMap.put("lawngreen", -8586240);
        sColorNameMap.put("lime", -16711936);
        sColorNameMap.put("limegreen", -13447886);
        sColorNameMap.put("palegreen", -6751336);
        sColorNameMap.put("lightgreen", -7278960);
        sColorNameMap.put("mediumspringgreen", -16713062);
        sColorNameMap.put("springgreen", -16744448);
        sColorNameMap.put("mediumseagreen", -12799119);
        sColorNameMap.put("seagreen", -13726889);
        sColorNameMap.put("forestgreen", -14513374);
        sColorNameMap.put("green", -16744448);
        sColorNameMap.put("darkgreen", -16751616);
        sColorNameMap.put("yellowgreen", -6632142);
        sColorNameMap.put("olivedrab", -9728477);
        sColorNameMap.put("olive", -8355840);
        sColorNameMap.put("darkolivegreen", -11179217);
        sColorNameMap.put("mediumaquamarine", -11193702);
        sColorNameMap.put("darkseagreen", -9419919);
        sColorNameMap.put("lightseagreen", -14634326);
        sColorNameMap.put("darkcyan", -16741493);
        sColorNameMap.put("teal", -16744320);

// 蓝色系
        sColorNameMap.put("aqua", -16711681);
        sColorNameMap.put("cyan", -16711681);
        sColorNameMap.put("lightcyan", -2031617);
        sColorNameMap.put("paleturquoise", -5247250);
        sColorNameMap.put("aquamarine", -8388652);
        sColorNameMap.put("turquoise", -12525360);
        sColorNameMap.put("mediumturquoise", -12004916);
        sColorNameMap.put("darkturquoise", -16724271);
        sColorNameMap.put("cadetblue", -10510688);
        sColorNameMap.put("steelblue", -12156236);
        sColorNameMap.put("lightsteelblue", -5192482);
        sColorNameMap.put("powderblue", -5185306);
        sColorNameMap.put("lightblue", -5383962);
        sColorNameMap.put("skyblue", -7876885);
        sColorNameMap.put("lightskyblue", -7876870);
        sColorNameMap.put("deepskyblue", -16728065);
        sColorNameMap.put("dodgerblue", -14774017);
        sColorNameMap.put("cornflowerblue", -10185235);
        sColorNameMap.put("royalblue", -12490271);
        sColorNameMap.put("blue", -16776961);
        sColorNameMap.put("mediumblue", -16777011);
        sColorNameMap.put("darkblue", -16777077);
        sColorNameMap.put("navy", -16777088);
        sColorNameMap.put("midnightblue", -15132304);

// 棕色系
        sColorNameMap.put("cornsilk", -1828);
        sColorNameMap.put("blanchedalmond", -5171);
        sColorNameMap.put("bisque", -6972);
        sColorNameMap.put("navajowhite", -8531);
        sColorNameMap.put("wheat", -663885);
        sColorNameMap.put("burlywood", -2180985);
        sColorNameMap.put("tan", -2968436);
        sColorNameMap.put("rosybrown", -4419697);
        sColorNameMap.put("sandybrown", -744352);
        sColorNameMap.put("goldenrod", -2448096);
        sColorNameMap.put("darkgoldenrod", -4684277);
        sColorNameMap.put("peru", -3308225);
        sColorNameMap.put("chocolate", -2987746);
        sColorNameMap.put("saddlebrown", -7650029);
        sColorNameMap.put("sienna", -6270419);
        sColorNameMap.put("brown", -5952982);
        sColorNameMap.put("maroon", -8388608);

// 白色系
        sColorNameMap.put("white", -1);
        sColorNameMap.put("snow", -1286);
        sColorNameMap.put("honeydew", -983056);
        sColorNameMap.put("mintcream", -655366);
        sColorNameMap.put("azure", -983041);
        sColorNameMap.put("aliceblue", -984833);
        sColorNameMap.put("ghostwhite", -460545);
        sColorNameMap.put("whitesmoke", -657931);
        sColorNameMap.put("seashell", -2578);
        sColorNameMap.put("beige", -657956);
        sColorNameMap.put("oldlace", -133658);
        sColorNameMap.put("floralwhite", -1296);
        sColorNameMap.put("ivory", -16);
        sColorNameMap.put("antiquewhite", -332841);
        sColorNameMap.put("linen", -331546);
        sColorNameMap.put("lavenderblush", -3851);
        sColorNameMap.put("mistyrose", -14336);

// 灰色系
        sColorNameMap.put("gainsboro", -2302756);
        sColorNameMap.put("lightgray", -2894893);
        sColorNameMap.put("silver", -4144960);
        sColorNameMap.put("darkgray", -5658199);
        sColorNameMap.put("gray", -8355712);
        sColorNameMap.put("dimgray", -9868951);
        sColorNameMap.put("lightslategray", -8943463);
        sColorNameMap.put("slategray", -9404272);
        sColorNameMap.put("darkslategray", -13676721);
        sColorNameMap.put("black", -16777216);

// 灰色系的英式拼写
        sColorNameMap.put("lightgrey", -2894893);
        sColorNameMap.put("darkgrey", -5658199);
        sColorNameMap.put("grey", -8355712);
        sColorNameMap.put("dimgrey", -9868951);
        sColorNameMap.put("lightslategrey", -8943463);
        sColorNameMap.put("slategrey", -9404272);
        sColorNameMap.put("darkslategrey", -13676721);
    }

    public static int getHtmlColor(String color) {
        try {
            Method getHtmlColor = Color.class.getMethod("getHtmlColor", String.class);
            return (int) getHtmlColor.invoke(null, color);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Integer integer = sColorNameMap.get(color);
        if (integer == null) {
            return 0;
        }
        return integer;
    }

    public static Application currentApplication() {
        try {
            @SuppressLint("PrivateApi") Class<?> aClass = Class.forName("android.app.ActivityThread");
            Method currentApplication = aClass.getMethod("currentApplication");
            Object application = currentApplication.invoke(null);
            return (Application) application;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
