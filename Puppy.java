public class Puppy {
   int puppyAge;

   public Puppy (String name) {
      System.out.println("Nama anjing adalah: "+name);
   }

   public void setAge( int age ) {
      puppyAge = age;
   }

   public int getAge(){
      System.out.println("Umur anjing adalah: "+puppyAge);
      return puppyAge;
   }

   public static void main (String [] args){
      Puppy myPuppy = new Puppy("Sari");

      myPuppy.setAge( 2 );
      myPuppy.getAge();

      System.out.println("Nilai variabel: "+myPuppy.getAge());
   }
}