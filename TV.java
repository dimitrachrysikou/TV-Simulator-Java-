public class TV {
    private boolean isOn;
    private int channel;
    private int volume;


    public TV(){
        this.isOn=false;    
        this.channel=1;         
        this.volume=1;          
    }


     //ENERGOPOIHSH-APENERGOPOIHSH
     public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn=isOn;
    }


    /*------------------KANALI----------------------------*/

    public int getChannel(){
        return channel;
    }
 
    //EPILOGH KANALIOU
    public void setChannel(int channel){
        if(isOn && (channel>=0 && channel<=100)){
            this.channel=channel;
            System.out.println("To kanali einai: "+this.channel);
        }
        else{
            System.out.println("H thleorash einai kleisth h mh egkyro kanali");    
        }
        
    }

    //EPOMENO KANALI
    public void nextChannel(){
        if (isOn){
            if(channel<=100){
                channel++;
                System.out.println("To kanali einai: "+channel);
            }
            else{
                System.out.println("Mh egkuro kanali");
            }
        } 
        else{
            System.out.println("H thleorash einai kleisth");
        }
    }


    //PROHGOUMENO KANALI
    public void previousChannel(){
        if(isOn){
            if(channel>0){
                channel--;
                System.out.println("To kanali einai: "+channel);
            }
            else{
                System.out.println("Mh egkuro kanali");
            }
            
        } else {
            System.out.println("TV is off");
        }
    }


    /*---------------------ENTASH--------------------------------*/
    public int getVolume(){
        return volume;
    }


    public void setVolume(int volume){
        if(isOn && volume>=0 && volume<=50){
            this.volume=volume;
            System.out.println("H entash einai: "+this.volume);
        }
        else{
            System.out.println("H thleorash einai kleisth h mh egkyro kanali");
            
        }
        
    }


    //AYJHSH ENTASHS
    public void increaseVolume(){
        if(isOn){
            if(volume<50){
                volume++;
                System.out.println("H entash einai: "+volume);
            } else {
                System.out.println("H entash einai sto  megisto");
            }
        } else {
            System.out.println("TV is off");
        }
    }


    //MEIWSH ENTASHS
    public void decreaseVolume(){
        if(isOn){
            if(volume>0){
                volume--;
                System.out.println("H entash einai: "+volume);
            } else {
                System.out.println("H entash einai 0");
            }
        } else {
            System.out.println("TV is off");
        }
    }
}
