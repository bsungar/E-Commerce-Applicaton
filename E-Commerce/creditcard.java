
package test;

//




/**
 *
 * @author beyza
 */
public class creditcard  {
    private long CreditcardNumber;
    private String CreditcardUser;
    private int Securitycode;
    private String expDate;
    
creditcard(){}
 
    

 
    

 public void setCreditCardNumber(long CreditcardNumber){   
this.CreditcardNumber= CreditcardNumber;
 }
public long getCreditcardNumber(){
    return CreditcardNumber;
}
public void setCreditCardUser(String CreditCardUser){
    this.CreditcardUser= CreditCardUser;
}
public String getCreditCardUser(){
    return CreditcardUser;
}
public void setSecuritycode(int Securitycode){
    this.Securitycode=Securitycode;
}
public int getSecuritycode(){
    return Securitycode;
}
public void setExpDate(String expDate){
    this.expDate = expDate;
}
public String getExpDate(){
    return expDate; 
}    
  

    
}


