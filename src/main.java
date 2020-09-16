import java.util.Scanner;
public class main{
    /**
     @author berkyigitdursun
     */
    @SuppressWarnings("unchecked")
    public static void test_function(){
        /**
        Integers 
        */
        GTUContainer<Integer> Vec=new GTUVector();
        GTUContainer<Integer> Set=new GTUSet();
        Scanner tt = new Scanner(System.in);
        int number;
        /**
        Adding Default size is 5 it will expand
         */
        System.out.println("Before adding size is (Vec)"+Vec.size());
        System.out.println("Before adding size is (SET)"+Set.size());
        for(int i=0;i<3;i++){
            Set.insert(10*i);
            Vec.insert((10-i)*10);
        }
        System.out.println("--------------------------------- Set printing ---------------------------------");
        Set.print();
        System.out.println("--------------------------------- Vec printing ---------------------------------");
        Vec.print();
        System.out.println("After adding size is (Vec)"+Vec.size());
        System.out.println("After adding size is (SET)"+Set.size());
        if(Set.empty()){
            System.out.println("Set is empty");
        }
        else{
            System.out.println("Set is not empty");
        }
        if(Vec.empty()){
            System.out.println("Vec is empty");
        }
        else{
            System.out.println("Vec is not empty");
        }
        System.out.println("SET AND Vec Test Clear Method");
        Vec.clear();
        Set.clear();
        Set.print();
        Vec.print();
        System.out.println("TEST THE ADDING SAME ELEMENT TO SET");
        Set.insert(10);
        Set.insert(20);
        Set.insert(10);
        Set.print();
        System.out.println("(SET)TEST ERASE METHOD");
        for(int i=0;i<10;i++){
            Set.insert(7*i);
            Vec.insert(7*i);
        }
        Set.print();
        System.out.println("GIVE THE ERASE ELEMENT(SET)");
        number=tt.nextInt();
        Set.erase(number);
        Set.print();
        System.out.println("(VEC)TEST ERASE METHOD");
        Vec.print();
        System.out.println("GIVE THE ERASE ELEMENT(Vec)");
        number=tt.nextInt();
        Vec.erase(number);
        Vec.print();
        System.out.println("--------------------- TESTING ITERATOR ---------------------");
        GTUIterator Sett = new GTUIterator(Set.iterator());
        GTUIterator Vecc = new GTUIterator(Vec.iterator());
        System.out.println("ITERATOR TEST ( PRINT WITH NEXT METHOD ) ( Remove 5.element)");
        for(int i=0;i<Vec.size()-1;i++){
            if(i==5){
                Vecc.erase();
            }
            System.out.print(Vecc.Next()+" ");
        }
        System.out.println(" ");
        
        /*System.out.println("SET ITERATOR TEST");
        for(int i=0;i<Set.size()-1;i++){
            System.out.println(Sett.Next());
        }*/
        
        System.out.println("------------------ Vec ------------------");
        Vec.print();
        System.out.println("(Vec)PLEASE GIVE THE SEARCHING NUMBER");
        number=tt.nextInt();
        if(Vec.contains(number)){
            System.out.println("THERE IS");
        }
        else{
            System.out.println("NOT FOUND");
        }
        System.out.println("------------------ SET ------------------");
        Set.print();
        System.out.println("(SET)PLEASE GIVE THE SEARCHING NUMBER");
        number=tt.nextInt();
        if(Set.contains(number)){
            System.out.println("THERE IS");
        }
        else{
            System.out.println("NOT FOUND");
        }
        
        
        

    }
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        test_function();
    }
}