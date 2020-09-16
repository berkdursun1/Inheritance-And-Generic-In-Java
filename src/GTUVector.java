/**
@author berkyigitdursun
*/
public class GTUVector<T> extends GTUContainer<T>{
    private T[] data ;
    private int data_size;
    private int MaxSize;
    
    @SuppressWarnings("unchecked")
    GTUIterator<T> iterator(){
        GTUIterator x = new GTUIterator(data);
        return x;
    }
    int size(){
        return data_size ;
    }
    /**
    Default constructor 
    Decide to size is 5
    */
    
    @SuppressWarnings("unchecked")
    public GTUVector(){
        super();
        data_size=0;
        data = (T[]) new Object[5];
        MaxSize=5;
    }
    /**
    One parameter constructor
    Size is giving parameter
    @param InitialSize Parameter Of Size ...
    */
    @SuppressWarnings("unchecked")
    public GTUVector(int InitialSize){
        super();
        if(InitialSize<0){
            System.out.println("Wrong assignment");
        }
        else{
            data=(T[]) new Object[InitialSize];
            data_size=0;
            MaxSize=InitialSize;
        }
    }
    /**
    İs empty or not
    @return true false empty or not
    */
    boolean empty(){
        if(data_size==0){
            return true;
        }
        return false;
    }
    /**
    @param value
    @return 
    */
    @SuppressWarnings("unchecked")
    boolean insert(T value){
        try{         
            if(data_size<MaxSize-1){
                data[data_size++]=value;
                return true;
            }
            else{
                data=expand();
                data[data_size++]=value;
                
                return true;
            }    
       }
       catch(IllegalArgumentException a){
            return false;
       }    
    }
    @SuppressWarnings("unchecked")
    public T[] expand(){
        T[] expandition = (T[]) new Object[MaxSize+5];
        for(int i=0;i<data_size;i++){
            expandition[i]=data[i];
        }
        MaxSize=MaxSize+5;
        return expandition;
    }
    void print(){
        if(empty()){
            System.out.println("VEC EMPTY");
        }
        else{
            for(int i=0;i<data_size && data[i]!=null;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println(" ");
        }
        
        
    }
    @SuppressWarnings("unchecked")
    void clear(){
        for(int i=0;i<data_size;i++){
            data[i]=null;
        }
        data_size=0;
    }
    int getSize(){
        return data_size;
    }
    @Override
    boolean contains(T search){
        for(int i=0;i<data_size;i++){
            if(data[i]==search){
                return true;
            }
        }
        return false;
    }
    @Override
    boolean erase(T hey){
        int k=0;
        for(int i=0;i<data_size;i++){
            if(data[i]==hey){
                for(k=i;k<data_size-1;k++){
                    data[k]=data[k+1];
                }
                data[k+1]=null;
                return true;
            }
        }
        return false;
    }   
    
}