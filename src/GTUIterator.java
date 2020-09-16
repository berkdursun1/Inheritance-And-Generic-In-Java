public class GTUIterator<T>{
    private T[] data; 
    private int index ;
    private int Size; 
    @SuppressWarnings("unchecked")
    /**
    One parameter constructor 
    index = 0
    this for begin method
     */
    public GTUIterator(T[] value){
        data=(T[])new Object[value.length];
        Size=value.length;
        data=value;
        index=0;
    }
    public void print(){
        System.out.println(index);
        System.out.println(data[index]);
        
    }
    @SuppressWarnings("unchecked")
    /**
    Copy constructor  */
    public GTUIterator(GTUIterator<T> copy){
        data=(T[])new Object[copy.Size];
        data=copy.data;
        index=copy.index;
        Size=copy.Size;
    }
    public boolean hasNext(){
        if(data[index+1]==null || index==Size){
            return false;
        }
        return true;
    }
    public GTUIterator<T> adding(){
        index++;
        return this;
    }
    public GTUIterator<T> extracting(){
        if(index>0)
            index--;
        return this;
    }
    /**
    @return 
    I increase index when ı found object in next method  */
    public T Next(){
        if( hasNext()){
            if(index<Size-1){
                index++;
                return data[index-1];
            }
            return data[index];
        }
        else{
            if(data[index]!=null) return data[index];
            System.exit(0);
        }
        
        return data[index-1];
    }
    public void erase(){
        int i=0;
        for( i=index;i<Size-1;i++){
                data[i]=data[i+1];
            }
            data[i]=null;
        
    }
    

}