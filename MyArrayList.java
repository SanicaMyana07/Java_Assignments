package Collections;

public class MyArrayList<E> {
        private int defaultSize= 10;
        private Object[] currentArrayList;
        private int size=0;

        public MyArrayList(){
            currentArrayList=new Object[defaultSize];
            }
        public  int length(){
            return size;
        }
        private boolean isFull(){
            return size == currentArrayList.length;
        }
        public void add(E object){
            //(E object) means the method takes one argument of type E, which is a placeholder for the type of element the list will store.
            if(isFull()){
                resizeArray();
            }
            currentArrayList[size]=object;
            size++;
        }

    private void resizeArray() {
            defaultSize= defaultSize*2 +1;
            Object[] newArrayList= new Object[defaultSize];
            customArrayCopy(currentArrayList,newArrayList,currentArrayList.length);
            currentArrayList=newArrayList;  // address same ho raha hai .
    }

    private void customArrayCopy(Object[] sourceArray, Object[] targetArray, int length) {
            for(int i=0;i<length;i++){
                targetArray[i]=sourceArray[i];
            }
    }

    public E get(int index){
            if(index>= size || index<0){
                throw new IndexOutOfBoundsException("Index: "+ index+ ", size: "+size);
            }
            return (E)currentArrayList[index];
    }


    public void removeElement(int index){
            get(index);
            for(int i=index;i<size;i++){
                currentArrayList[i]=currentArrayList[i+1];
            }
        currentArrayList[size-1]=null;
        size--;
    }

    public void remove(E object){
            int index=returnIndex(object);
            get(index);
            removeElement(index);

    }

    public int returnIndex(E object){
            for(int i=0;i<size;i++){
                if(currentArrayList[i]== object){
                    return i;
                }
            }
            return 0;
    }
    public void print(){
            for(int i=0;i<currentArrayList.length;i++){
                if(currentArrayList[i]!=null) {
                    System.out.print(currentArrayList[i] + " ");
                }
            }
        System.out.println();
    }
}

