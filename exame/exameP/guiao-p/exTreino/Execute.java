import java.math.*;
import java.util.HashMap;

public class Execute extends BigIntBaseVisitor<BigInteger> {

   HashMap<String,BigInteger> map = new HashMap<>();

   @Override public BigInteger visitAssign(BigIntParser.AssignContext ctx) {
      BigInteger a = visit(ctx.expr());
      String s = ctx.ID().getText();
      
      if(a!= null) map.put(s, a);
      return a;
   }

   @Override public BigInteger visitPrint(BigIntParser.PrintContext ctx) {
      System.out.print(visit(ctx.expr()));
      String  c  = ctx.getText();
      BigInteger a = BigInteger.ZERO;
      BigInteger b = BigInteger.ZERO;
      a = new BigInteger(c, 2);
      b = new BigInteger(c, 10);
      System.out.print("["+a+""+b+"]");
      return BigInteger.ZERO;
   }

   @Override public BigInteger visitExprNum(BigIntParser.ExprNumContext ctx) { 
      String s = ctx.NUM().getText();
      BigInteger a = BigInteger.ZERO;
      if(s!= null)a=map.get(s);
      return a; 
   }

}
