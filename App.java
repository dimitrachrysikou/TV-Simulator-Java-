public class App {
    public static void main(String[] args){
        TV tv=new TV();

        System.out.println("     H THLEORASH EINAI ANOIXTH?: NAI");
        tv.setIsOn(true);

        //KANALI
        tv.setChannel(20); 

        tv.nextChannel();
        
        tv.previousChannel();
        

        //ENTASH
        tv.setVolume(25);

        tv.increaseVolume(); 
      
        tv.decreaseVolume(); 

        System.out.println("      H THLEORASH EINAI KLEISTH?: NAI");
        tv.setIsOn(false);

       
 
    }
}


        
