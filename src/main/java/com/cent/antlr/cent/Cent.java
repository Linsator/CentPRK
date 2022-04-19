package com.cent.antlr.cent;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cent {

    public static void main(String[] args) {

        Cent calculator = new Cent();
        String basePath = new File("").getAbsolutePath();

        String validTestPath = "\\src\\main\\resources\\validTest.txt";
        String invalidTestPath = "\\src\\main\\resources\\invalidTest.txt";


        System.out.println("Testing valid expressions");
        File validFile = new File(basePath+validTestPath);
        try {
            Scanner validFileReader = new Scanner(validFile);
            while (validFileReader.hasNextLine()){
                String line = validFileReader.nextLine();
                System.out.println(line + " = " +calculator.calculate(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Testing invalid expressions");

        File invalidFile = new File(basePath+invalidTestPath);
        Scanner invalidFileReader = null;
        try {
            invalidFileReader = new Scanner(invalidFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (invalidFileReader.hasNextLine()){
            String res = null;
            String line = null;
            try {

                line = invalidFileReader.nextLine();
                calculator.calculate(line);
            }
            catch (Exception e){
                System.out.println("Expression " + line + " couldn't be processed.");
            }
            System.out.println(line + " = " + res);
        }

        /* legacy ;)
        System.out.println(calculator.calculate("2 + 5\n") + " should be 7");  // 7.0
        System.out.println(calculator.calculate("2 * 5\n") + " should be 10");  // 10.0
        System.out.println(calculator.calculate("2 + -5\n") + " should be -3");  // -3
        System.out.println(calculator.calculate("2 * -5\n") + " should be -10");  // -10

        System.out.println(calculator.calculate("3 & 5\n") + " should be 1");  // 011 & 101 = 001 => 1
        System.out.println(calculator.calculate("2 | 5\n") + " should be 7");  // 010 | 101 = 111 => 7
        System.out.println(calculator.calculate("2 ^ 5\n") + " should be 7"); // 010 ^ 101 = 111 => 7
        System.out.println(calculator.calculate("~5\n") + " should be -6");     // ~0000 0000 0000 0101 = 1111 1111 1111 1010 => BIG
        System.out.println(calculator.calculate("(2 + 5) * 3\n") + " should be 21");  // 7.0

         */
    }

    private String calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private String compile(CharStream source) {
        CentLexer lexer = new CentLexer(source);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CentParser parser = new CentParser(tokenStream);
        ParseTree tree = parser.expr();
        CentVisitorImpl visitor = new CentVisitorImpl();
        return visitor.visit(tree);
    }
}
