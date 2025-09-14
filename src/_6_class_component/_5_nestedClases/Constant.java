package _6_class_component._5_nestedClases;

public class Constant {
    static class Mysql {
        static class Dev {
            public static final String USERNAME = "mysql dev user";
            public static final String PASSWORD = "mysql dev pass";
        }

        static class QA {
            public static final String USERNAME = "mysql qa user";
            public static final String PASSWORD = "mysql qa pass";
        }

        static class Prod {
            public static final String USERNAME = "mysql prd user";
            public static final String PASSWORD = "mysql prd pass";
            //final cannot be reassing in same block
            // Why? → final makes value unchangeable after it's assigned.
//            void name(){
//                PASSWORD = "mysql";
//            }
        }
    }

    static int a = 100;
}
