package com2;

import com1.Test1006;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-14 16:29
 * </pre>
 */

public class Outer1006 {
    protected class Inner implements Test1006 {
        @Override
        public void show() {
            System.out.println("Inner...");
        }

        public Inner() {
        }
    }
}
