class ExcecaoA extends Exception {
}

// -------------------- arquivo ExcecaoAB.java --------------------
class ExcecaoAB extends ExcecaoA {
}

// -------------------- arquivo ClasseA.java --------------------
abstract class ClasseA {
          private int x=1;
          int y=2;
          public ClasseA(int p)
          {
                   x=p;
          }
          public int mt_a(int a,int b)
          {
                  try {
                              if(a%2==1)
                                        throw new ExcecaoAB();
                              return a+b;
                  }
                  catch(ExcecaoAB e) {
                              return a*x+b*y;
                  }
                  catch(Exception e) {
                              return a*x-b*y;
                  }
          }
}

// -------------------- arquivo ClasseB.java --------------------
class ClasseB extends ClasseA {
           int x=2;
           int y=4;
           public ClasseB()
          {
                    super(0);
          }
          public int mt_a(int a,int b)
          {
                    try {
                              if(b%2==1)
                                        throw new ExcecaoA();
                              return a-b;
                    }
                    catch(ExcecaoAB e) {
                              return 4*y;
                    }
                    catch(Exception e) {
                              return 5*x;
                    }
                    finally {
                                x++;
                                 y++;
                    }
           }
}

// -------------------- arquivo Q07.java --------------------
public class Q07 {
           public static void main(String[] args) {
                        ClasseA c=new ClasseB();
                        System.out.println(c.mt_a(2,3));
            }
}

