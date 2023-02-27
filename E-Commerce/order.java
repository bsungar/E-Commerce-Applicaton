
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author beyza
 */

  public class order {
     
      order(){}
      public void productOrder(){
    Scanner bs = new Scanner(System.in);
    ArrayList<product> productList = new ArrayList<>();
     product urun1=new product("telefon","kırmızı","electronic device",10,"200 gr","Smart Phone");
    product urun2=new product("laptop", "gri","electronic device", 20, "1500 gr", "15 inch");
    product urun3= new product("buzdolabı", "beyaz", "electronic device", 30,"60 kg", "2 m" );
    product urun4= new product("tükenmez kalem", "siyah", "kırtasiye", 80, "10 gr", "refillable");
    product urun5 = new product("matara", "mor", "spor ekipmanı", 40, "500 ml", "nature friendly");
productList.add(urun1);
productList.add(urun2);
productList.add(urun3);
productList.add(urun4);
productList.add(urun5);
     
    System.out.println(productList);
    
    System.out.println("Hangisini istiyorsunuz? Numarasını yazın.");
    int choice = bs.nextInt();
    switch(choice){
            case 1:
                System.out.println("Telefonu seçtiniz.");
                System.out.println("Kaç tane istiyorsunuz?");
                int number = bs.nextInt();
                int productS = urun1.getStock();
                if(productS>number){
                    System.out.println("Ürün stokta vardır.");
                }
                else{
                    System.out.println("Ürün stokta kalmamıştır. :(");
                }
                break;
            case 2:
                System.out.println("Laptopu seçtiniz.");
                System.out.println("Kaç tane istiyorsunuz?");
                int number1 = bs.nextInt();
                int ProductS1 = urun2.getStock();
                if(ProductS1 >number1){
                    
                    System.out.println("Ürün stokta vardır.");
                }
              else{
                    System.out.println("Ürün stokta kalmamıştır. :(");
                }
                break;
            case 3: 
                System.out.println("Buzdolabını seçtiniz.");
                System.out.println("Kaç tane istiyorsunuz?");
                int number2 = bs.nextInt();
                int productS2 = urun3.getStock();
                if(productS2>number2)
                    System.out.println("Ürün stokta vardır.");
                
                
                else{
                    System.out.println("Ürün stokta kalmamıştır. :(");
                }
                break;
            case 4:
                System.out.println("Tükkenmez Kalemi seçtiniz.");
                System.out.println("Kaç tane istiyorsunuz?");
                int number3 = bs.nextInt();
                int productS3 = urun4.getStock();
                if(productS3>number3){
                    
                    System.out.println("Ürün stokta vardır.");
                }
               
                else{
                    System.out.println("Ürün stokta kalmamıştır. :(");
                }
                break;
            case 5:
                System.out.println("Matarayı seçtiniz.");
                System.out.println("Kaç tane istiyorsunuz?");
                int number4 = bs.nextInt();
                int productS4 = urun5.getStock();
                if(productS4>number4){
                    
                    System.out.println("Ürün stokta vardır.");
                }
              
                else{
                    System.out.println("Ürün stokta kalmamıştır. :(");}
                break;}

 }
public void favouriteProduct(){
   Scanner sc = new Scanner(System.in);
    ArrayList<product> favouriteProduct = new ArrayList<>();
    product urun1=new product("telefon","kırmızı","electronic device",10,"200 gr","Smart Phone");
    product urun2=new product("laptop", "gri","electronic device", 20, "1500 gr", "15 inch");
    product urun3= new product("buzdolabı", "beyaz", "electronic device", 30,"60 kg", "2 m" );
    product urun4= new product("tükenmez kalem", "siyah", "kırtasiye", 80, "10 gr", "refillable");
    product urun5 = new product("matara", "mor", "spor ekipmanı", 40, "500 ml", "nature friendly");
favouriteProduct.add(urun1);
favouriteProduct.add(urun2);
favouriteProduct.add(urun3);
favouriteProduct.add(urun4);
favouriteProduct.add(urun5);
     
    System.out.println(favouriteProduct);
    System.out.println("Hangisi favori ürününüz? Numarasını yazın.");
    int fav = sc.nextInt();
    switch(fav){
        case 1:
            favouriteProduct.add(urun1);
            System.out.println("Telefon favorilere eklendi.");
            break;
        case 2:
            favouriteProduct.add(urun2);
            System.out.println("Laptop favorilere eklendi.");
            break;
        case 3:
            favouriteProduct.add(urun3);
            System.out.println("Buzdolabı favorilere eklendi.");
            break;
        case 4:
            favouriteProduct.add(urun4);
            System.out.println("Tükenmez Kalem favorilere eklendi.");
            break;
        case 5:
            favouriteProduct.add(urun5);
            System.out.println("Matara favorilere eklendi.");
            break;
    }
}



}

    
      
     

    

  

