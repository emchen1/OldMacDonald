class Chick implements Animal 
{     
  private String myType;     
  private String mySound; 
  private String myotherSound;
  private double x;
  Chick(String type,String otherSound, String sound) {         
    myType = type;         
    mySound = sound;
    myotherSound = otherSound;
    x = Math.random();
  }     
  public Chick() {         
    myType = "";         
    mySound = "";
    myotherSound = "";
  }      
  public String getSound() {
    if(x<.5)
    return mySound;
    else
    return myotherSound;
    
  }     
  public String getType() {
    return myType;
  }
}