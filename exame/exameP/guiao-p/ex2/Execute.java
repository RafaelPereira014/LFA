import java.util.*;

public class Execute extends FracLangBaseVisitor<Fraction> {

   private Map<String,Fraction> symbolTable = new HashMap<>();

   @Override public Fraction visitAssign(FracLangParser.AssignContext ctx) {
      Fraction res = visit(ctx.expr());
      String var = ctx.ID().getText();
      symbolTable.put(var,res);
      return res;
   }

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      System.out.println(res);
      return res;
   }

   @Override public Fraction visitExprFract(FracLangParser.ExprFractContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction res = null;
      Fraction e = visit(ctx.expr(0));
      Fraction e1 = visit(ctx.expr(1));
         switch(ctx.op.getText()){
            case "+":
               res = e.add(e1);
               break;
            case "-":
               res = e.sub(e1);
               break;
         }

      return res;
   }

   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      return visit(ctx.expr()).symetric();
   }
   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) { 
      return visit(ctx.expr()); 
   }


   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      switch(ctx.op.getText()){
         case "*":
            res = e1.mult(e2);
            break;
         case ":":
            res = e1.div(e2);
            break;
      }
      return res;

   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      String var = ctx.ID().getText();
      if(!symbolTable.containsKey(var))
         System.err.println("ERROR");
      else
         res = symbolTable.get(var);
      return res;
   }
   @Override public Fraction visitExprInt(FracLangParser.ExprIntContext ctx) {
      return  new Fraction(Integer.parseInt(ctx.getText()));
   }

   @Override public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      return new Fraction(Integer.parseInt(ctx.INTEGER(0).getText()),Integer.parseInt(ctx.INTEGER(1).getText()));
       }

}
