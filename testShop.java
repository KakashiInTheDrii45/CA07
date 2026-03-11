import java.util.Scanner;
public class testShop{

   
    public static fillArray(Shop arrShop[]){
        Scanner scn = new Scanner(System.in);
        String shopName = " ";
        int i=0;
        while(shopName.toLowerCase() != "x"){
        System.out.print("Enter the name of shop (X to quit) : " );
        shopName = scn.nextLine();
        Shop tempShop = new Shop(shopName); 
        arrShop[i] = tempShop;
        i++;

        }
    }

    public static void DisplayArray(){
        String form = "%-15s %15s%n";
        System.out.println(form, "Name" ,"Vistors");
        for(int i=0;i<Shop.getNumberOfShops(); i++){
            System.out.print(i+1);
            Shop.toString();
            

        }
        
    }


    public static void  main(String[] args){
        
    Shop[] arrShops = new Shop[10];
    fillArray();

    }
}
    