
package test;


import java.util.Scanner;

/**
 *
 * @author beyza
 */
public class user{
    Scanner sc = new Scanner(System.in);
   private String username;
   private String name;
   private String surname;
   private String birthday;
   private String password;
   private String email;
   private String homeadress;
   private String workadress;
   private String productsordered;
   private String favproducts;
   private String creditcardobj;
   
  
   
   user(){}
   user(String username, String name, String surname, String birthday, String password, String email, String homeadress, String workadress){
       this.username = username;
       this.name = name;
       this.surname = surname;
       this.birthday = birthday;      
       this.email = email;
       this.password = password;
       this.homeadress = homeadress;
       this.workadress = workadress;
   }
   
   
   
   public void setUsername(String username){
       this.username= username;
   }
   public String getUsername(){
       return username;
   } 
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setSurname(String surname){
       this.surname=surname;
   } 
   public String getSurname(){
       return surname;
   }
   public void setBirthday(String birthday){
       this.birthday=birthday;
   }
   public String getBirthday(){
       return birthday;
   }
   public void setPassword(String password){
       this.password= password;
   }
   public String getPassword(){
       return password;
   }
   public void setEmail(String email){
       this.email=email;
   }
   public String getEmail(){
       return email;
   }
   public void setHomeadress(String homeadress){
       this.homeadress=homeadress;
   }
   public String getHomeadress(){
       return homeadress;
   }
   public void setworkadress(String workadress){
       this.workadress= workadress;
   }
public String getworkadress(String workadress){
    return workadress;
}
public void setProductsOrdered(String productsordered){
    this.productsordered= productsordered;
}
public String getProductsOrdered(){
    return productsordered;
}
public void setFavProducts(String favproducts){
    this.favproducts=favproducts;
}
public String getFavProducts(){
    return favproducts;
}
public void setCreditCardObj(String creditcardobj){
    this.creditcardobj= creditcardobj;
}
public String getCreditCardObj(){
    return creditcardobj;
}
public static void askuserInf(){
Scanner sc = new Scanner(System.in);    
System.out.println("Kullanıcı adınızı girin: ");    
String setUsername= sc.next();
    System.out.println("Adınızı girin: ");
    String setName = sc.next();
    System.out.println("Soyadınızı girin: " );
    String setSurname = sc.next();
    System.out.println("Doğum tarihinizi girin: ");
    String setBirthday = sc.next();
    System.out.println("Şifrenizi girin: ");
    String setPassword = sc.next();
    System.out.println("Emailinizi girin: ");
    String setEmail = sc.next();
    System.out.println("Ev adresinizi girin: ");
    String sethomeadress= sc.next();
    System.out.println("İş adresinizi girin: ");
    String setworkadress = sc.next();
}
public static void askcreditcInf(){
      Scanner sc = new Scanner(System.in); 
    System.out.println("Enter your Credit card number: ");
     long setCreditcardNumber;
     setCreditcardNumber = sc.nextLong();
     System.out.println("Enter your Credit card Username: ");
     String setCreditCardUser = sc.nextLine();
     System.out.println("Enter your card's Security code: ");
     int setSecuritycode = sc.nextInt();
     System.out.println("Enter your card's expiration date: ");
     String setexpdDate= sc.next();
    
}





}







      