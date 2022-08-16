class CLA {
    public static void main(String[] args) {
        for (String arg : args) { //means "for arg in args". loops through the array basically, and loads the value of args[index] into arg
            System.out.print(arg + " ");

            /*
            when running, use cmd:
                - > "javac CommandlineArguments.java"
                - > "java NewMain This is an example of command-line arguments"
                - > prints This is an example of command-line arguments
             */
        }

    }
}