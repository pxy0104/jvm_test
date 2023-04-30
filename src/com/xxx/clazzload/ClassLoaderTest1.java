package com.xxx.clazzload;

/**
 * 2023/4/30
 **/

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        //引导类加载器：null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);
        try {
            ClassLoader classloader = Class.forName("java.lang.String").getClassLoader();
            ClassLoader sysclassloader = Class.forName("com.xxx.clazzload.ClassLoaderTest1").getClassLoader();
            System.out.println(sysclassloader);
            System.out.println(classloader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ClassLoaderTest1[] arr = new ClassLoaderTest1[1];
        ClassLoader arrclassLoader = arr.getClass().getClassLoader();
        System.out.println(arrclassLoader);


    }
}
