package ua.project.homeworks.homework4;

public class ExceptionPart1 {
//    public static void main(String[] args) throws Throwable {
//
//    }


//    public static void main(String[] args) {
//        try{
//
//        }catch (Throwable t){
//
//        }
//    }


//    public static void main(String[] args) {
//        throw new Error();
//    }

//
//    public static void main(String[] args) {
//        Error ref = new Error();
//        throw ref;
//    }

//    public static void main(String[] args) {
//        f(null);
//    }
//
//    public static void f(NullPointerException e) {
//        try{
//            throw e;
//        }catch (NullPointerException npe){
//            f(npe);
//        }
//
//    }

//    public static void main(String[] args) {
//        System.out.println("sout");
//        throw new Error();
//    }

//    public double sqr(double arg){
//        return arg*arg;
//    }

//    public double sqr(double arg){
//        int k = 1;
//        return k;
//    }

//    public static double sqr(double arg) {
//        return "hello!";
//    }

//    public static double sqr(double arg) {
//    }

//    public static double sqr(double arg){
//        if (System.currentTimeMillis()%2 == 0){
//            return arg * arg;
//        }
//    }

//    public static void main(String[] args) {
//        double d = sqr(10.0);
//        System.out.println(d);
//
//    }
//    public static double sqr(double arg){
//
//    }
//
//    public static double sqr(double arg){
//        while (true);
//    }


//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg;
//        } else {
//            while (true);
//        }
//    }

//    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }

//    public static double sqr(double arg){
//        long time = System.currentTimeMillis();
//        if (time%2 == 0){
//            return arg*arg;
//        } else if (time % 2== 1){
//            while (true);
//        } else {
//            throw new RuntimeException();
//        }
//    }

//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//        } else {
//            return width * height;
//        }
//    }

//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ");
//        }
//        return width * height;
//    }
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1;
//        }
//        return width * height;
//    }

//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }

//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }

    //Nonlocal control transfer

//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f();
//        System.err.println("#1.out");
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g();
//        System.err.println(".   #2.out");
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h();
//        System.err.println(".   .   #3.out");
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.RETURN");
//            return;
//        }
//        System.err.println(".   .   .   #4.out");
//    }

//
//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f();
//        System.err.println("#1.out");
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g();
//        System.err.println(".   #2.out");
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h();
//        System.err.println(".   .   #3.out");
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error();
//        }
//        System.err.println(".   .   .   #4.out");
//    }


//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        try {
//            f();
//        } catch (Error e) {
//            System.err.println("#1.CATCH");
//        }
//        System.err.println("#1.out");
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g();
//        System.err.println(".   #2.out");
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h();
//        System.err.println(".   .   #3.out");
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error();
//        }
//        System.err.println(".   .   .   #4.out");
//    }

//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f();
//        System.err.println("#1.out");
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        try {
//            g();
//        } catch (Error e) {
//            System.err.println(".   #2.CATCH");
//        }
//        System.err.println(".   #2.out");
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h();
//        System.err.println(".   .   #3.out");
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error();
//        }
//        System.err.println(".   .   .   #4.out");
//    }


//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f();
//        System.err.println("#1.out");
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g();
//        System.err.println(".   #2.out");
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        try {
//            h();
//        } catch (Error e) {
//            System.err.println(".   .   #3.CATCH");
//        }
//        System.err.println(".   .   #3.out");
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error();
//        }
//        System.err.println(".   .   .   #4.out");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print("0");
//            if (true) {throw new RuntimeException();}
//            System.err.print("1");
//        } catch (Exception e) {
//            System.err.print("2");
//        }
//        System.err.println("3");
//    }

//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                RuntimeException re = (RuntimeException) e;
//                System.err.print("Это RuntimeException ");
//            } else {
//                System.err.print("В каком смысле не RuntimeException???");
//            }
//        }
//    }

//    public static void main(String[] args) throws Exception {
//        try {
//            System.err.print("0");
//            if (true) {throw new Exception();}
//            System.err.print("1");
//        } catch (RuntimeException e) {
//            System.err.print("2");
//        }
//        System.err.print("3");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch (Exception e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//            if (true) {throw new Error();}
//        }
//        System.err.println(" 3");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//            if (true) {throw e;}
//        }
//        System.err.println(" 3");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//            if (true) {throw new Error();}
//        } catch (Error e) {
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }


//
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();}
//                System.err.print(" 2.3");
//            } catch (Throwable t) {
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) {
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }

//    public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }

//    public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }

//    public static void main(String[] args) {
//        try {
//            Throwable t = new Exception();
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//
//
//    }


//    public static void main(String[] args) {
//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }

//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }

//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }


//
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }

//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }


//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        long rnd = System.currentTimeMillis();
//        boolean finished = false;
//        try {
//            if (rnd % 3 == 0) {
//                throw new Error();
//            } else if (rnd % 3 == 1) {
//                throw new RuntimeException();
//            } else {
//                // nothing
//            }
//            finished = true;
//        } finally {
//            if (finished) {
//
//            } else {
//
//            }
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3");
//            } finally {
//                System.err.print(" 4");
//            }
//            System.err.print(" 5");
//        } catch (Exception e) {
//            System.err.print(" 6");
//        } finally {
//            System.err.print(" 7");
//        }
//        System.err.print(" 8");
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3");
//            } finally {
//                System.err.print(" 4");
//            }
//            System.err.print(" 5");
//        } catch (Exception e) {
//            System.err.print(" 6");
//        } finally {
//            System.err.print(" 7");
//        }
//        System.err.print(" 8");
//    }


//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Exception();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3");
//            } finally {
//                System.err.print(" 4");
//            }
//            System.err.print(" 5");
//        } catch (Exception e) {
//            System.err.print(" 6");
//        } finally {
//            System.err.print(" 7");
//        }
//        System.err.print(" 8");
//    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Error();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3");
//            } finally {
//                System.err.print(" 4");
//            }
//            System.err.print(" 5");
//        } catch (Exception e) {
//            System.err.print(" 6");
//        } finally {
//            System.err.print(" 7");
//        }
//        System.err.print(" 8");
//    }


}


