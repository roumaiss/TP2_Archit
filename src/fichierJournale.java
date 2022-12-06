import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public class  FichierJournal implements IJournal{

  @Override
  public void outPut_Msg(String message) {
    
    String message = System.currentTimeMillis() + Integer.toString(ThreadLocalRandom.current().nextInt(50, 1000));
    
    new File(message + "_journal.txt");
    
  }
  
}
