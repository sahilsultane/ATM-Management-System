public class Atm extends Account{ 
    void changePin(int currentpin,int newpin,int confirmpin){

        if(pin!=currentpin)
        {
            System.out.println("Current Pin is Incorrect  ");
            return;
        }
        else if (pin==newpin )
        {

            System.out.println("New PIN cannot be the same as the old PIN.");
        }
        else if(newpin!=confirmpin){
            System.out.println("PINs do not match.");
        }
        else if(newpin==confirmpin){
            pin=newpin;
            System.out.println("PIN changed successfully.");
            
        }
   


    }
}
