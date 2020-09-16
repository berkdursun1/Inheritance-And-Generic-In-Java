/**
@author berkyigitdursun
 */
public class GTUSet<T> extends GTUContainer<T>{
    private T[] data ;
    private int data_size;
    private int MaxSize;
    
    int size(){
        return data_size ;
    }
    int max_size(){
        return MaxSize;
    }
    @SuppressWarnings("unchecked")
    
    GTUIterator<T> iterator(){
        GTUIterator x = new GTUIterator(data);
        return x;
    }
    @SuppressWarnings("unchecked")
    public GTUSet(){
        super();
        data_size=0;
        data = (T[]) new Object[5];
        MaxSize=5;
    }
    boolean empty(){
        if(data_size==0){
            return true;
        }
        return false;
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
    /**
    Add a value
    @param value  
    
    */
    @SuppressWarnings("unchecked")
     boolean insert(T value){
       boolean control=true; 
      
       try{       
            for(int i=0;i<data_size-1;i++){
                if(data[i]==value){control=false;}
            }
            if(control==false){
                return false;
            }
                else{
                    if(data_size<MaxSize){
                    data[data_size++]=value;
                
                    return true;
                }
                else{
                    data=expand();
                    data[data_size++]=value;
                    data_size++;
                    return true;
                }
            }
            
       }
       catch(IllegalArgumentException a){
           System.out.println("HELLO");
            return false;
       }    
    }
    void print(){
        if(empty()){
            System.out.println("GTUSet EMPTY");
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
        data=(T[]) new Object[5];
        data_size=0;
        MaxSize=5;
    }
    @Override
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
    /**
    Remove the given parameter
    @param hey 
    */
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