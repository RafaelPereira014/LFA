import java.util.*;

public class Execute extends FracLangBaseVisitor<Fraction> {
   HashMap<String,Fraction> map = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public Fraction visitAssign(FracLangParser.AssignContext ctx) {
      Fraction res = visit(ctx.expr());
      String s = ctx.ID().getText();

      if(res != null) map.put(s, res);
      return null;

   }

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override public Fraction visitExprParents(FracLangParser.ExprParentsContext ctx) {
      return visit(ctx.expr());
   }


   @Override public Fraction visitExprNUM(FracLangParser.ExprNUMContext ctx) {
     return new Fraction(Integer.parseInt(ctx.getText()));
   }

   @Override public Fraction visitExprReadStr(FracLangParser.ExprReadStrContext ctx) {
      String text = ctx.STRING().getText();
      System.out.print(text.substring(1, text.length()-1) + ": ");
      String in = sc.nextLine();
      if (in.contains("/")) {
         String[] frac = in.split("/");
         try {
             return new Fraction(Integer.parseInt(frac[0]), Integer.parseInt(frac[1]));
         } catch (Exception e) {
             System.err.println("ERROR: invalid input");
             return null;
         }
     } else {
         try {
             return new Fraction(Integer.parseInt(in));
         } catch (Exception e) {
             System.err.println("ERROR: invalid input");
             return null;
         }
     }
   }

   @Override public Fraction visitExprSumSub(FracLangParser.ExprSumSubContext ctx) {
      Fraction res = null;
      String op = ctx.op.getText();
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      switch(op){
         case"+":
          res = e1.sum(e2);
          break;
         
         case"-":
            res = e1.sub(e2);
            break;
      }
      return res;
   }

   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      return visit(ctx.expr()).Symetric();
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;
      String op = ctx.op.getText();
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      switch(op){
         case"*":
          res = e1.mult(e2);
          break;
         
         case":":
            res = e1.div(e2);
            break;
      }
      return res;
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      return visit(ctx.expr()).reduce();
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      String s = ctx.ID().getText();
      if(s!= null){
         res = map.get(s);
      }
      return res;
   }

   @Override public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      return new Fraction(Integer.parseInt(ctx.NUM(0).getText()),Integer.parseInt(ctx.NUM(1).getText()));
   }
}
