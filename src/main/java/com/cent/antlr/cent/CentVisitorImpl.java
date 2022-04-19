package com.cent.antlr.cent;

import java.util.Locale;

public class CentVisitorImpl extends CentBaseVisitor<String> {

    private String swapBits(String bits){
        StringBuilder sb = new StringBuilder();
        for (char c : bits.toCharArray()) {
            if(c == '0'){
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

    private String handleBool(String left, String operator, String right) {
        byte L = 0b0;
        int LI = 0;
        if(left != null){
             L = Byte.parseByte(left.substring(2)); // remove 0b
            LI = Integer.parseInt(left.substring(2), 2);
        }

        byte R = Byte.parseByte(right.substring(2)); // remove 0b
        int RI = Integer.parseInt(right.substring(2), 2);

        switch (operator) {
            case "+":
                return "0b" + Integer.toBinaryString(LI + RI);
            case "*":
                return "0b" + Integer.toBinaryString(LI * RI);
            case "&":
                return "0b" + Byte.toString((byte) (L & R));
            case "|":
                return "0b" + Byte.toString((byte) (L | R));
            case "^":
                return "0b" + Byte.toString((byte) (L ^ R));
            case "~":
                return "0b" + swapBits(right.substring(2));
            default:
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
        }
    }

    private String handleInt(String left, String operator, String right){
        int L = 0;
        if(left != null){
            L = Integer.parseInt(left);
        }

        int R = Integer.parseInt(right);

        switch (operator) {
            case "+":
                return Integer.toString(L + R);
            case "*":
                return Integer.toString(L * R);
            case "&":
                return Integer.toString(L & R);
            case "|":
                return Integer.toString(L | R);
            case "^":
                return Integer.toString(L ^ R);
            case "~":
                return Integer.toString(~R);
            default:
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
        }
    }

    @Override
    public String visitOpexpr(CentParser.OpexprContext ctx) {


        String left = null;
        if(ctx.left != null){
            left = this.visit(ctx.left);
        }
        String right = null;
        if(ctx.right != null){
            right = this.visit(ctx.right);
        }

        if (ctx.operator == null) {
            System.out.print("An operator of +, -, &, |, ^, ~ is required to perform the operation\n");
            return null;
        }
        String operator = ctx.operator.getText();


        if(right.toLowerCase(Locale.ROOT).startsWith("0b")) {
            if(left == null || left.toLowerCase(Locale.ROOT).startsWith("0b")){
                return handleBool(left, operator, right);
            }
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        }

        return handleInt(left, operator, right);
    }
    @Override
    public String visitParexpr(CentParser.ParexprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(CentParser.LeafexprContext ctx) {
        return ctx.getText();
    }
}
