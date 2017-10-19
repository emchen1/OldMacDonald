
public void setup() {     
  Cow c = new Cow("cow", "moo");
  Chick a = new Chick("chick","cheep", "cluck");
  Pig b = new Pig("pig", "oink");
  System.out.println(c.getType() + " goes " + c.getSound());  
 System.out.println(a.getType() + " goes " + a.getSound());
 System.out.println(b.getType() + " goes " + b.getSound());
 Farm MacDonalds = new Farm();
 MacDonalds.animalSounds();
}  