package OOP.Pensionato;


public class SistemaDeAluguel {
    private String Name, Email;
    private int Room;
    
    
    public SistemaDeAluguel(String Name, String Email, int Room){
        this.Name= Name;
        this.Email= Email;
        this.Room =Room;
        
    
    }
   
    public String toString() {
        return  Room+": "+ Name +", "+ Email;
    }
    
    public int getRoom() {
        return Room;
    }
    
    
    public String getName(){
        return Name;
    }
    
    public String  getEmail() {
        return Email;
    }
    
    public void setRoom(int Room) {
        this.Room = Room;
    }
    

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setName(String Name) {
        this.Name=Name;
    }


    

}
