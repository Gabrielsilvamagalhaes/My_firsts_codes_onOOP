public class Product {
    private String Name;
    private double Price;
    private int Quantity, NewQuantity;
    
        
    public Product(String Name, double Price, int Quantity){
        this.Name= Name;
        this.Price = Price;
        this.Quantity = Quantity;        
    }
    public Product(){

    }
    
    
    
    
        public double TotalValueInStock(){
            return this.Price * this.Quantity;
           
        }

        public void AddProducts(int Quantity){
            NewQuantity = this.Quantity + Quantity;
            double NewTotalPrice = this.Price * NewQuantity; 
            
            System.out.println("Updated data : "+ Name + ", " + "$"+this.Price+ ", "+ NewQuantity+ " units, Total: $"+ NewTotalPrice);

        }
        public void RemoveProducts(int Quantity){
            
            if(Quantity>=NewQuantity){
                System.out.println("I cant proceed the operation!");
            }
            else{

                Product obj = new Product();
                obj.setNewQuantity(NewQuantity, -Quantity);
                double NewTotalPrice = this.Price * obj.getNewQuantity(); 
                
                System.out.println("Updated data : "+ Name + ", " + "$"+this.Price+ ", "+ obj.getNewQuantity()+ " units, Total: $"+ NewTotalPrice);
            }
        }            

    public int getNewQuantity() {
        return NewQuantity;
    }

    public void setNewQuantity(int NewQuantity, int Quantity) {
        
        this.NewQuantity = NewQuantity+Quantity;
    }

}
