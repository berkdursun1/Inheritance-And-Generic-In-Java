/**
*/
abstract class GTUContainer<T>{
		public GTUContainer(){}
		abstract int size();
		abstract boolean empty();
		abstract void print();
		abstract boolean insert(T value);
		abstract void clear();
		abstract int getSize();
		abstract GTUIterator<T> iterator();
		abstract boolean contains(T hey);
		abstract boolean erase(T hey);
}