package com.taoism.journeytojava.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2017-03-04
 * Time: 16:44
 * Author: cf
 * -----------------------------
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        //使用List 保持着常量池的引用，避免 Full GC 回收常量池行为
        List<String> list = new ArrayList<>();

        //10MB 的 PermSize 在integer 范围内足够产生 OOM 了

        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
