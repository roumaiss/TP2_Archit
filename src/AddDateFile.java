import java.time.LocalDate;

public class addDateFile implements Ijournal{

  @Override
  public void outPut_Msg(String message){

  }
  
  public String addDate(String message, String clas){
    
    String newMessage = LocalDate.now().toString() + " " + clas + " : ";
    
    return newMessage + message;
  }
}
