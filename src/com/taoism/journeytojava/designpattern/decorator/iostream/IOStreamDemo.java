package com.taoism.journeytojava.designpattern.decorator.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Date: 2017-05-24
 * Time: 10:27
 * Author: cf
 * -----------------------------
 */
public class IOStreamDemo {

    public static void main(String[] args) {
        fileIO();

        copyFileUseNormalIO();

        copyFileUseBuffedIO();


        useCustomInputFilter();


    }

    public static void fileIO() {

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/input.txt");

            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1) {
                System.out.print(new String(bytes));
            }

            System.out.println("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/output.txt");

            String str = "我写入文件";

            byte[] bytes = str.getBytes();

            outputStream.write(bytes);
            outputStream.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void copyFileUseNormalIO() {

        long start = System.currentTimeMillis();

        InputStream inputStream = null;

        OutputStream outputStream = null;


        try {

            inputStream = new FileInputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/louderthanwords.mp4");

            outputStream = new FileOutputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/louderthanwords_copy.mp4");

            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1) {
                outputStream.write(bytes);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            long end = System.currentTimeMillis();
            System.out.println("不用缓冲，拷贝图片耗时" + (end - start) + "ms");

        }


    }


    public static void copyFileUseBuffedIO() {

        long start = System.currentTimeMillis();

        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;


        try {

            inputStream = new FileInputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/louderthanwords.mp4");
            bufferedInputStream = new BufferedInputStream(inputStream);

            outputStream = new FileOutputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/louderthanwords_copy.mp4");
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte[] bytes = new byte[1024];
            while (bufferedInputStream.read(bytes) != -1) {
                bufferedOutputStream.write(bytes);
            }

            bufferedOutputStream.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            long end = System.currentTimeMillis();
            System.out.println("利用缓冲，拷贝图片耗时" + (end - start) + "ms");

        }


    }


    public static void useCustomInputFilter() {
        InputStream inputStream = null;

        BufferedInputStream bufferedInputStream = null;

        LowerCaseInputStream lowerCaseInputStream = null;

        try {
            inputStream = new FileInputStream("/Users/Morphin3/Java/JourneyToJava/src/com/taoism/journeytojava/designpattern/decorator/iostream/input.txt");

            bufferedInputStream = new BufferedInputStream(inputStream);

            lowerCaseInputStream = new LowerCaseInputStream(bufferedInputStream);

//            int c;

//            while ((c = lowerCaseInputStream.read()) != -1){
//                System.out.print((char) c);
//            }

            byte[] bytes = new byte[1024];
            while (lowerCaseInputStream.read(bytes) != -1) {
                System.out.print(new String(bytes));
            }

            System.out.println("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (lowerCaseInputStream != null) {
                try {
                    lowerCaseInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
