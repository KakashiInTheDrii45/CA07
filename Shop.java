public class Shop{
    private String name;
    private int visitors;
    private static int numberOfShops = 0;
    



    Shop(){numberOfShops+=1;}
    Shop(String name, int visitors, int numberOfShops){
        this.name = name;
        
    }
    
    
    public void setVisitors(){
        Random rand = new Random();
        this.visitors = rand.nextInt(100);
        
    }
    
    
    public void setNumberOfShops(int number){
        this.numberOfShops = number;
    }
    /* 
    public set(){}
    
    public get(){}
    public get(){}
    public get(){} 
*/
    
    toString(){}
    Display(){}
} 
