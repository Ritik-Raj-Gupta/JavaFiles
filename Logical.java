class Logical{
    public  static void main(String[] args){
        System.out.println("Logical AND: ");
        System.out.println((10>5) && (2>1));
        System.out.println((10>5) && (2<1));
        System.out.println((10<5) && (2<1));
        System.out.println("Logical OR: ");
        System.out.println((10>5) || (2>1));
        System.out.println((10>5) || (2<1));
        System.out.println((10<5) || (2<1));
        System.out.println("Logical NOT: ");
        System.out.println(!(10>5));
        System.out.println(!(10<5));
        /*
        OUTPUT:
        Logical AND: 
        true
		false
		false
		Logical OR: 
		true
		true
		false
		Logical NOT: 
		false
		true
        */
    }
}
