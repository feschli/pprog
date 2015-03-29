package assignment6.searchAndCount;

public class Util {
  
  public enum Workload {
    HEAVY, LIGHT,
  }
  
  public static boolean doWork(int n, Workload w) {
    return (w == Workload.HEAVY) ? doWorkHeavy(n) : doWorkLight(n);
  }
  
  // In this function we will do any sort of work
  // to find information about a point, in this case
  // we want to find if a particular random number is prime
  public static boolean doWorkHeavy(int n) {
    
    int sqrt = (int) Math.sqrt(n);
    
    for (int i = 2; i <= sqrt; i++) {
      if (n % i == 0)
        return false;
    }
    
    return true;
  }
  
  public static boolean doWorkLight(int n) {
    
    if (n == 1)
      return false;
    
    return true;
  }
}
