package com.taoism.journeytojava.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2017-03-04
 * Time: 15:32
 * Author: cf
 * -----------------------------
 */
public class HeapOOM {

    static class OOMObjcet{

    }

    public static void main(String[] args) {

        List<OOMObjcet> list  = new ArrayList<OOMObjcet>();

        while (true){
            list.add(new OOMObjcet());
        }

    }
}
