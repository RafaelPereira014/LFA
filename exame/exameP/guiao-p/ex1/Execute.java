import java.util.HashMap;
import java.util.Scanner;

public class Execute extends StrLangBaseVisitor<String> {
    HashMap<String, String> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);

   @Override public String visitMain(StrLangParser.MainContext ctx) {
      return visitChildren(ctx);
   }
   	@Override public String visitExprBoss(StrLangParser.ExprBossContext ctx) { 
         return visit(ctx.expr()); 
   }


   @Override public String visitStat(StrLangParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitAssign(StrLangParser.AssignContext ctx) {
      String res = visit(ctx.expr());
        String ID = ctx.VAR().getText();

        if (res != null) map.put(ID, res);

        return "";
   }

   @Override public String visitPrintString(StrLangParser.PrintStringContext ctx) {
       String res = visit(ctx.expr());
       System.out.println(res);
        if (res != null)
            return res;

        return "";
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
        System.out.print(visit(ctx.expr()));
        String res = sc.next();
        
        return res;
   }
   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
         String res = ctx.STRING().getText();
        return res.substring(1, res.length()-1);
   }

   @Override public String visitExprVAR(StrLangParser.ExprVARContext ctx) {
      String ID = ctx.VAR().getText();

        if(!map.containsKey(ID)) {
            System.err.println("");
            return null;
        }
        return map.get(ID);
   }
   	@Override public String visitExprAdd(StrLangParser.ExprAddContext ctx) {       
         return visit(ctx.expr(0))+visit(ctx.expr(1)); 
         }
      @Override public String visitExprSub(StrLangParser.ExprSubContext ctx) { 
         String in = visit(ctx.expr(0));
         String  repl = visit(ctx.expr(1));
         in = in.replaceAll(repl,"");
         return in; 
       }

      @Override public String visitExprSubstitute(StrLangParser.ExprSubstituteContext ctx) { 
         String res = visit(ctx.expr(0));
         String old = visit(ctx.expr(1));
         String nova = visit(ctx.expr(2));
         res = res.replaceAll(old,nova);
         return res; 
         }
      @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) { 
        System.out.print(visit(ctx.expr()));
        return "";
      }


}
