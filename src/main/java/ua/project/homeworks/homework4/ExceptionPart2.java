package ua.project.homeworks.homework4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPart2 {

//    public static void main(String[] args) throws Exception {
//        throw new Exception(); // тут ошибка компиляции
//    }

//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }
//
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {
//
//    }
//    public static void f1() throws FileNotFoundException {
//
//    }

//
//    public static void main(String[] args) throws IOException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }

//    public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {
//
//    }
//    public static void f1() throws FileNotFoundException {
//
//    }
//    public static void f2() throws InterruptedException {
//
//    }


//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Throwable e) {
//
//        }
//    }


//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        } catch (EOFException e) {
//            // ...
//        }
//    }

//    public static void main(String[] args) throws Throwable {
//        Throwable t = new Exception();
//        throw t;
//    }

//    public static void f0(Throwable t) throws Exception {
//        throw t;
//    }
//    public static void f1(Object ref){
//        char c = ref.charAt(0);
//    }

//    public static void main(String[] args) throws Throwable {
//        try {
//            Throwable t = new Exception(); // а лететь будет Exception
//            throw t;
//        } catch (Exception e) { // и мы перехватим Exception
//            System.out.println("Перехвачено!");
//        }
//    }

//    public static class Parent {
//        public void f() throws IOException, InterruptedException {}
//    }
//
//    static class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {}
//    }
}
